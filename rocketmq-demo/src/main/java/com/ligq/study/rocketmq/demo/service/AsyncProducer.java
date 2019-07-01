package com.ligq.study.rocketmq.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Slf4j
public class AsyncProducer {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("study-rocketmq-producer");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        producer.setRetryTimesWhenSendAsyncFailed(0);

        int messageCount = 10;
        CountDownLatch countDownLatch = new CountDownLatch(messageCount);
        for (int i =0;i<messageCount;i++){
            Message message = new Message("TopicTest", "TagsA", ("Hello World Async" + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
            producer.send(message, new SendCallback() {
                @Override
                public void onSuccess(SendResult sendResult) {
                     countDownLatch.countDown();
                    log.info("AsyncProducer send success, result == {}", sendResult);
                }

                @Override
                public void onException(Throwable e) {
                    countDownLatch.countDown();
                    log.info("AsyncProducer send fail, e == {}", e);
                }
            });
        }

        countDownLatch.await(5, TimeUnit.SECONDS);
        producer.shutdown();
    }
}
