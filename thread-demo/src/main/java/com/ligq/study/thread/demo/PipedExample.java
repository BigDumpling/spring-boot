package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

@Slf4j
public class PipedExample {
    public static void main(String[] args) throws IOException {
        PipedWriter out = new PipedWriter();
        PipedReader in = new PipedReader();
        out.connect(in);

        Thread thread = new Thread(new Print(in), "print");
        thread.start();

        int receive = 0;
        try {
            while ((receive = System.in.read()) != -1) {
                out.write(receive);
            }
        } finally {
            out.close();
        }

    }

    static class Print implements Runnable {
        private PipedReader in;

        public Print(PipedReader in) {
            this.in = in;
        }

        @Override
        public void run() {
            int receive = 0;
            while (true) {
                try {
                    if ((receive = in.read()) != -1) {
                        log.info("{}", (char) receive);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
