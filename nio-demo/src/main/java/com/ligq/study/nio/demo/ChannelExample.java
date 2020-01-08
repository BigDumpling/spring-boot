package com.ligq.study.nio.demo;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.Selector;

@Slf4j
public class ChannelExample {

    public static void main(String[] args) {
//        readExample();
        transferExample();
    }

    private static void readExample() {
        try (RandomAccessFile aFile = new RandomAccessFile("D:\\study\\保理通客户.txt", "rw")) {
            FileChannel channel = aFile.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(57);

            // 读取数据，放入buffer
            int size = channel.read(byteBuffer);
            while (size != -1) {
                log.info("read size == {} \n", size);

                // 设置buffer切换模式为读模式
                byteBuffer.flip();
                StringBuilder sb = new StringBuilder();
                while (byteBuffer.hasRemaining()) {

                    // 每次读取 1byte，也就是一个字节
                    sb.append((char) byteBuffer.get());
                }
                log.info("sb == {}", sb);

                // 清空buffer，准备再次写入
                byteBuffer.clear();
                size = channel.read(byteBuffer);
            }

        } catch (Exception e) {
            log.error("error: {}", e.fillInStackTrace());
        }
    }

    private static void transferExample() {
        try (RandomAccessFile fromFile = new RandomAccessFile("D:\\study\\保理通客户.txt", "rw");
             RandomAccessFile toFile = new RandomAccessFile("D:\\study\\保理通客户2.txt", "rw");
             FileChannel fromChannel = fromFile.getChannel();
             FileChannel toChannel = toFile.getChannel()) {
            long position = 0;
            long count = fromFile.length();
            log.info("count == {}", count);
            toChannel.transferFrom(fromChannel, position, count);
        } catch (Exception e) {
            log.error("error: {}", e.fillInStackTrace());
        }
    }

    private static void selectorExample() {
        try {
            Selector selector = Selector.open();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
