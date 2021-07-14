package com.study.ligq.common.test;

import java.util.Objects;
import java.util.logging.Logger;

public class QuickOrderExample {

    private final static Logger logger = Logger.getLogger("QuickOrderExample");

    public static void main(String[] args) {
        int[] arr = new int[]{9, 3, 6, 1, 8, 5, 8, 7, 0, 1, 4, 2};
        order(arr);
    }

    private static void order(int[] arr) {
        if (Objects.isNull(arr) || arr.length < 2) {
            logger.info("数组为null或者长度小于2，不需要排序处理");
            return;
        }

        quickSort(arr, 0, arr.length - 1);
        logger.info("== end == ");
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int l = left, r = right, x = arr[left];
            while (l < r) {

                /**
                 * 右边部分处理
                 */
                while (l < r && arr[r] >= x) {
                    r--;
                    logger.info("右边部分处理, l == " + l + ", r == " + r);
                }
                if (l < r) {
                    arr[l++] = arr[r];
                }

                /**
                 * 左边部分处理
                 */
                while (l < r && arr[l] < x) {
                    l++;
                    logger.info("左边部分处理, l == " + l + ", r == " + r);
                }
                if (l < r) {
                    arr[r--] = arr[l];
                }
            }

            /**
             * 递归处理
             */
            arr[l] = x;
            quickSort(arr, left, l - 1);
            quickSort(arr, l + 1, right);
        }
    }

}
