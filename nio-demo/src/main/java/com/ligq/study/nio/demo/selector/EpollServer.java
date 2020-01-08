package com.ligq.study.nio.demo.selector;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.Paths;
import java.util.Iterator;

@Slf4j
public class EpollServer {

    public static void main(String[] args) {
        try (ServerSocketChannel serverSocketChannel = ServerSocketChannel.open()) {
            serverSocketChannel.socket().bind(new InetSocketAddress(9002));
            serverSocketChannel.configureBlocking(false);

            Selector selector = Selector.open();
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            ByteBuffer readBuffer = ByteBuffer.allocate(1024);
            ByteBuffer writeBuffer = ByteBuffer.allocate(1024);

            writeBuffer.put("received: ".getBytes());
            writeBuffer.flip();

            FileChannel fileChannel = FileChannel.open(Paths.get(""));

            while (true) {
                int n = selector.select();
                if (n == 0) {
                    continue;
                }

                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    switch (key.readyOps()) {
                        case SelectionKey.OP_ACCEPT:
                            SocketChannel accept = serverSocketChannel.accept();
                            accept.configureBlocking(false);
                            accept.register(selector, SelectionKey.OP_READ);
                            break;
                        case SelectionKey.OP_CONNECT:
                            log.info("----- connect -----");
                            break;
                        case SelectionKey.OP_READ:
                            SocketChannel read = (SocketChannel) key.channel();
                            readBuffer.clear();
                            read.read(readBuffer);
                            readBuffer.flip();
                            log.info("received: {}", new String(readBuffer.array()));
                            key.interestOps(SelectionKey.OP_WRITE);
                            break;
                        case SelectionKey.OP_WRITE:
                            writeBuffer.rewind();
                            SocketChannel write = (SocketChannel) key.channel();
                            write.write(writeBuffer);
                            key.interestOps(SelectionKey.OP_READ);
                            break;
                        default:
                            log.info("");
                            break;
                    }

                    iterator.remove();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
