package com.wool.algorithm.sort;

/**
 * @Author wanglin
 * @Date 2019/2/27
 * 冒泡排序，时间复杂度 O(N^2)
 */
public class BubbleSort {

    /**
     * @param arr 数组
     * @param n   数组大小
     */
    public static void sort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        /**
         * 冒泡排序一轮比较完之后会冒出一个，因此需要n轮比较，也就是外层循环
         */
        for (int i = 0; i < n; i++) {
            /**
             * 两两比较，从下角标为0开始，每一轮过后都会少一次两两比较
             */
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
