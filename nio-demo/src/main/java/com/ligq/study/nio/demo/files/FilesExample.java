package com.ligq.study.nio.demo.files;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Slf4j
public class FilesExample {

    public static void main(String[] args) {
//        copy();
        move();
    }

    private static void copy() {
        try {
            Path source = Paths.get("D:\\backup\\files\\测试.docx");
            Path target = Paths.get("D:\\backup\\files-backup\\测试.docx");
            Files.copy(source, target, StandardCopyOption.ATOMIC_MOVE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void move() {
        try {
            Path source = Paths.get("D:\\backup\\files\\测试-2.docx");
            Path target = Paths.get("D:\\backup\\files-backup\\测试.docx");
            Files.move(target, source);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
