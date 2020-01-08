package com.ligq.study.nio.demo.channel;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

@Slf4j
public class WebServer {

    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.socket().bind(new InetSocketAddress(9001));
            SocketChannel channel = serverSocketChannel.accept();

            ByteBuffer byteBuffer = ByteBuffer.allocate(128);
            channel.read(byteBuffer);

            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                log.info("{}", (char) byteBuffer.get());
            }

            channel.close();
            serverSocketChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
