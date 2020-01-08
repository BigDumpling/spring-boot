package com.ligq.study.nio.demo.pipe;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

@Slf4j
public class PipeExample {

    private final static String DATA = "Hello World";

    public static void main(String[] args) {
        try {
            Pipe pipe = Pipe.open();
            Pipe.SinkChannel sinkChannel = pipe.sink();
            Pipe.SourceChannel sourceChannel = pipe.source();

            ByteBuffer buffer = ByteBuffer.allocate(128);
//            buffer.clear();
            buffer.put(DATA.getBytes());
            buffer.flip();
//            while (buffer.hasRemaining()) {
//                sinkChannel.write(buffer);
//            }
            sinkChannel.write(buffer);

            ByteBuffer readBuffer = ByteBuffer.allocate(128);
            sourceChannel.read(readBuffer);
            log.info("read == {}", new String(readBuffer.array()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
