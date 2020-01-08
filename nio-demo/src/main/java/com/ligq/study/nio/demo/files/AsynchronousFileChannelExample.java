package com.ligq.study.nio.demo.files;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Slf4j
public class AsynchronousFileChannelExample {

    private final static Path PATH = Paths.get("D:\\backup\\files\\学习路线.txt");

    public static void main(String[] args) {
//        futureRead();
        handlerRead();
    }

    private static void futureRead() {
        try (AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(PATH, StandardOpenOption.READ)) {
            ByteBuffer readBuffer = ByteBuffer.allocate(1024);
            Future<Integer> future = fileChannel.read(readBuffer, 0);
            while (!future.isDone()) {

            }
            readBuffer.flip();
            log.info("data == {}", new String(readBuffer.array()));
            readBuffer.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void handlerRead() {
        try (AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(PATH)) {
            ByteBuffer readBuffer = ByteBuffer.allocate(1024);
            ByteBuffer buffer = ByteBuffer.allocate(2048);
            buffer.clear();
            readBuffer.put("Hello World \n".getBytes());
//            buffer.flip();
            fileChannel.read(readBuffer, 0, readBuffer, new CompletionHandler<Integer, ByteBuffer>() {
                @Override
                public void completed(Integer result, ByteBuffer attachment) {
                    log.info("result == {}", result);
//                    attachment.flip();
                    log.info("result byte == {}", new String(attachment.array()));
                }

                @Override
                public void failed(Throwable exc, ByteBuffer attachment) {
                    log.info("error == {}", exc.fillInStackTrace());
                    log.error("error buffer == {}", new String(attachment.array()));
                }
            });

            TimeUnit.SECONDS.sleep(10);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
