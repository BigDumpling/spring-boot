package com.ligq.study.nio.demo.pipe;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.util.concurrent.CountDownLatch;

@Slf4j
public class PipeThreadExample {
    private final static String DATA = "Hello World";

    public static void main(String[] args) {
        try {
            CountDownLatch countDownLatch = new CountDownLatch(2);
            Pipe pipe = Pipe.open();
            Pipe.SinkChannel sinkChannel = pipe.sink();

            ByteBuffer buffer = ByteBuffer.allocate(128);
            buffer.clear();
            buffer.put(DATA.getBytes());
            buffer.flip();
            sinkChannel.write(buffer);
            countDownLatch.countDown();
            PipeThread pipeThread = new PipeThread(pipe, countDownLatch);
            pipeThread.run();
            countDownLatch.await();
            log.info("----- end -----");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static class PipeThread implements Runnable {
        private Pipe pipe;
        private CountDownLatch countDownLatch;

        public PipeThread(Pipe pipe, CountDownLatch countDownLatch) {
            this.pipe = pipe;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                ByteBuffer buffer = ByteBuffer.allocate(128);
                Pipe.SourceChannel sourceChannel = pipe.source();
                sourceChannel.read(buffer);
                log.info("read == {}", new String(buffer.array()));
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        }
    }

}
