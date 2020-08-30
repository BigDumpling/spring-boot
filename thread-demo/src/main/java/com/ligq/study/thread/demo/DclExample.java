package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class DclExample {

    private static Object object;

    public static void main(String[] args){
        if(Objects.isNull(object)){
            synchronized (object){
                object = new Object();
                System.out.println("object == " + object.hashCode());
            }
        }
    }

}
