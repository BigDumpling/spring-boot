package com.ligq.study.nio.demo.io;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

@Slf4j
public class ServerExample {

    private final static int PORT = 9003;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket conn = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            BufferedWriter bw = new BufferedWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
