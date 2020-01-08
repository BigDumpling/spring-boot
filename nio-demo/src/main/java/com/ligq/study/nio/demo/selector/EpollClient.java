package com.ligq.study.nio.demo.selector;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

@Slf4j
public class EpollClient {

    public static void main(String[] args) {
        try (SocketChannel socketChannel = SocketChannel.open()) {
            socketChannel.connect(new InetSocketAddress("127.0.0.1", 9002));

            ByteBuffer readBuffer = ByteBuffer.allocate(128);
            ByteBuffer writeBuffer = ByteBuffer.allocate(128);

            writeBuffer.put("Hello".getBytes());
            writeBuffer.flip();

            while (true) {
                writeBuffer.rewind();
                socketChannel.write(writeBuffer);
                readBuffer.clear();
                socketChannel.read(readBuffer);
                readBuffer.flip();
                if (readBuffer.hasRemaining()) {
                    log.info("{}", new String(readBuffer.array()));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
