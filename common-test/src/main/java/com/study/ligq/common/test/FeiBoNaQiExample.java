package com.study.ligq.common.test;

import java.util.logging.Logger;

public class FeiBoNaQiExample {

    private final static Logger logger = Logger.getLogger("FeiBoNaQiExample");

    public static void main(String[] args){
        for (int i = 0;i<10;i++){
            logger.info("i" + i + " == " + process(i));
        }
    }

    private static long process(long num){
        if(num == 0){
            return 1;
        }

        if(num == 1){
            return 1;
        }

        return process(num - 2) + process(num - 1);
    }
}
