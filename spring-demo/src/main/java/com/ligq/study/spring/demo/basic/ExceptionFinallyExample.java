package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionFinallyExample {

    public static void main(String[] args) {
        for (int i =1; i< 5; i++){
            String value = f(i);
            log.info(" ----- value-{} ----- == {} ---------- ", i, value);
        }
    }

    public static String f(int i) {
        log.info("Initialization that requires cleanup");
        String value = null;
        try {
            log.info("Point 1");
            if (i == 1) {
                value = "1";
            }

            log.info("Point 2");
            if (i == 2) {
                value = "2";
            }

            log.info("Point 3");
            if (i == 3) {
                value = "3";
            }

            log.info("Point 4");
            if (i == 4) {
                value = "4";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            log.info("Performing cleanup");
        }

        return value;
    }
}
