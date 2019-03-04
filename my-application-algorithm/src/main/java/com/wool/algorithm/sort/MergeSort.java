package com.wool.algorithm.sort;

/**
 * @Author wanglin
 * @Date 2019/2/28
 * 归并排序，时间复杂度O(nlogn)
 * 核心思想是将数组分成前后两部分，然后对前后两部分分别排序，再将排序好的两个部分合并在一起
 */
public class MergeSort {

    public static void sort(int[] arr, int n) {
        mergeSort(arr, 0, n - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);
        merge(arr, left, middle, right);
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        /**
         * 看哪边的数组还有剩余
         */
        int start = i;
        int end = middle;
        if (j <= right) {
            start = j;
            end = right;
        }

        /**
         * 将剩余的元素追加到temp中
         */
        while (start <= end) {
            temp[k++] = arr[start++];
        }

        /**
         * 再将temp拷贝到原arr中
         */
        for (int l = 0; l < temp.length -1; l++) {
            arr[left + l] = temp[l];
        }
    }

}
