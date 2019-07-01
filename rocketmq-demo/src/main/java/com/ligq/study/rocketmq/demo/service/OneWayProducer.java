package com.ligq.study.rocketmq.demo.service;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

public class OneWayProducer {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("study-rocketmq-producer");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();

        Message message = new Message("TopicTest", "TagsA", "Hello World OneWay".getBytes(RemotingHelper.DEFAULT_CHARSET));
        producer.sendOneway(message);
        producer.shutdown();
    }
}
