package com.ligq.study.rocketmq.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

@Slf4j
public class SyncProducer {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("study-rocketmq-producer");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();


        Message message = new Message("TopicTest", "TagsA", "Hello World".getBytes(RemotingHelper.DEFAULT_CHARSET));
        SendResult result = producer.send(message);
        log.info("result == {}", result);

//        for (int i=0;i<100;i++){
//            Message message = new Message("TopicTest", "TagsA", ("Hello World" + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
//            SendResult result = producer.send(message);
//            log.info("result == {}", result);
//        }

        producer.shutdown();
    }
}
