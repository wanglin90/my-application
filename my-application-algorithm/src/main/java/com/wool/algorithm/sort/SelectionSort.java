package com.wool.algorithm.sort;

/**
 * @Author wanglin
 * @Date 2019/2/27
 * 选择排序，时间复杂度O(N^2)
 * 跟插入排序类似，将数组分为已排序区间和未排序区间，区别是取未排序区间里最小的元素加入到已排序区间的末尾。
 */
public class SelectionSort {

    /**
     * @param arr 数组
     * @param n   数组大小
     */
    public static void sort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            /**
             * mark the first element of unsorted as minimum
             */
            int minimum = arr[i];
            int minIndex = i;

            /**
             * for each of the unsorted elements
             * extract the minimum element X
             */
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < minimum) {
                    minimum = arr[j];
                    minIndex = j;
                }
            }

            /**
             * swap
             */
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
