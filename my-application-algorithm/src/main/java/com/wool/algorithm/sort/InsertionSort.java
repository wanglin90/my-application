package com.wool.algorithm.sort;

/**
 * @Author wanglin
 * @Date 2019/2/27
 * 插入排序，时间复杂度O(N^2)
 * 将数组分成已排序区间和未排序区间。初始已排序区间只有一个元素，就是数组的第一个元素。
 * 插入排序的核心思想就是取未排序区间中的元素，在已排序区间中找到合适位置将其插入，并保证已排序区间一直有序。
 * 重复这个过程，知道未排序区间中元素为0，算法结束。
 */
public class InsertionSort {

    /**
     * @param arr 数组
     * @param n   数组大小
     */
    public static void sort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        /**
         * mark first element as sorted
         * for each unsorted element X
         */
        for (int i = 1; i < n; i++) {
            /**
             * 'extract' the element X
             */
            int value = arr[i];
            /**
             * for j = lastSortedIndex down to 0
             * if current element j > X
             * move sorted element to the right by 1
             */
            int j = i - 1;
            for (; j >= 0; --j) {
                if (arr[j] > value) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            /**
             * break loop and insert X here
             */
            arr[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 1, 3, 2};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\r\n");
        sort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
