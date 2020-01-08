package com.ligq.study.spring.demo.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionHandleService {

    public static void main(String[] args){
        handle();
    }

    public static void handle(){
      log.info("----- start -----");
      for (int i = 0; i< 10; i++){
          log.info("i == {}", i);
          if(i == 5){
              throw new RuntimeException("RuntimeException message");
          }
      }
      log.info("----- end -----");
    }
}
