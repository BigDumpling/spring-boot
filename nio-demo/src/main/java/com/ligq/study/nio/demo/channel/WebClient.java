package com.ligq.study.nio.demo.channel;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

@Slf4j
public class WebClient {

    public static void main(String[] args) {
//       single();
       gather();
    }

    private static void single(){
        try(SocketChannel socketChannel = SocketChannel.open()) {
            socketChannel.connect(new InetSocketAddress("127.0.0.1", 9001));

            ByteBuffer byteBuffer = ByteBuffer.allocate(128);
            byteBuffer.put("Hello World".getBytes());

            byteBuffer.flip();
            socketChannel.write(byteBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void gather(){
        try(SocketChannel socketChannel = SocketChannel.open()) {
            socketChannel.connect(new InetSocketAddress("127.0.0.1", 9001));
            ByteBuffer helloBuffer = ByteBuffer.allocate(128);
            ByteBuffer worldBuffer = ByteBuffer.allocate(128);
            helloBuffer.put("Hello".getBytes());
            worldBuffer.put("World".getBytes());

            helloBuffer.flip();
            worldBuffer.flip();
            ByteBuffer[] byteBuffers = new ByteBuffer[]{helloBuffer, worldBuffer};
            socketChannel.write(byteBuffers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
