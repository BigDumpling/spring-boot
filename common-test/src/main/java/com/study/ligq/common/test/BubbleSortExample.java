package com.study.ligq.common.test;

import java.util.Objects;
import java.util.logging.Logger;

public class BubbleSortExample {

    private final static Logger logger = Logger.getLogger("BubbleSortExample");

    public static void main(String[] args) {
        int[] arr = new int[]{9, 3, 6, 1, 8, 5, 8, 7, 0, 1, 4, 2};
        order(arr);
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    private static void order(int[] arr) {
        logger.info("排序前的数组：" + arr);
        if (Objects.isNull(arr) || arr.length < 2) {
            logger.info("数组为null或者长度小于2，不需要排序");
            return;
        }

        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        logger.info("排序后的数组：" + arr);
    }

}
