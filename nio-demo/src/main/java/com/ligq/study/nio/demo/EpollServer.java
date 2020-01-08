package com.ligq.study.nio.demo;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

@Slf4j
public class EpollServer {

    private final static int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        log.info("----- start -----");
        try {

            /**
             * 创建ServerSocketChannel实例，并绑定端口
             */
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.socket().bind(new InetSocketAddress(9001));

            /**
             * 创建Selector实例，将serverSocketChannel注册到Selector，指定事件 OP_ACCEPT
             */
            Selector selector = Selector.open();
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            while (true) {
                /**
                 * 如果没有准备好的socket，select方法会被阻塞一段时间并返回0
                 */
                int n = selector.select();
                if (n == 0) {
                    log.info("为获取到Selector");
                    continue;
                }

                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    if (key.isAcceptable()) {
                        log.info("----- accept -----");
                        SocketChannel channel = ((ServerSocketChannel) key.channel()).accept();
                        channel.configureBlocking(false);
                        channel.register(key.selector(), SelectionKey.OP_READ, ByteBuffer.allocate(BUFFER_SIZE));
                    }

                    if (key.isConnectable()) {
                        log.info("----- connect -----");
                    }

                    if (key.isReadable()) {
                        log.info("----- read -----");
                    }

                    if (key.isWritable()) {
                        log.info("----- write -----");
                    }

                    iterator.remove();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
