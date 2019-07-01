package com.ligq.study.rocketmq.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerOrderly;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Slf4j
public class OrderedConsumer {
    public static void main(String[] args) throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("study-rocketmq-producer-order");
        consumer.setNamesrvAddr("localhost:9876");
        consumer.subscribe("TopicTest", "TagsA || TagsB || TagsC");
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        AtomicLong consumeTimes = new AtomicLong(0);
        consumer.registerMessageListener(new MessageListenerOrderly() {
            @Override
            public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs, ConsumeOrderlyContext context) {
                log.info("current thread == {}", Thread.currentThread().getName());
                log.info("msgs == {}", msgs);
                log.info("context == {}", context);

                context.setAutoCommit(false);
                consumeTimes.incrementAndGet();

                if((consumeTimes.get() % 2) == 0){
                    return ConsumeOrderlyStatus.SUCCESS;
                } else if ((consumeTimes.get() % 2) == 1){
                    return ConsumeOrderlyStatus.SUSPEND_CURRENT_QUEUE_A_MOMENT;
                }

                return ConsumeOrderlyStatus.SUCCESS;
            }
        });

        consumer.start();

        Thread.sleep(10000);
        consumer.shutdown();
    }
}
