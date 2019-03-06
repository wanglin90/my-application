package com.wool.algorithm.sort;

/**
 * @Author wanglin
 * @Date 2019/3/5
 * 其核心思想是：如果要排序下标从p到r的数组，我们选择p到r之间任一数据作为pivot(分区点)，遍历p到r之间的数据，比pivot小的放左边，比pivot大的放右边，pivot放中间
 * 这样数据就分成了3个部分，[p,pivot] [pivot] [pivot,r]，利用分治思想再对左边和右边循环这个过程。
 */
public class QuickSort {

    /**
     * @param arr 数组
     * @param n   数组大小
     */
    public static void sort(int[] arr, int n) {
        quickSort(arr, 0, n - 1);
    }

    private static void quickSort(int[] arr, int p, int r) {
        if (p >= r) {
            return;
        }
        /**
         * 获取分区点
         */
        int q = partition(arr, p, r);
        quickSort(arr, p, q - 1);
        quickSort(arr, q + 1, r);
    }

    private static int partition(int[] arr, int p, int r) {
        /**
         * 取最右边的数组作为基准
         */
        int pivot = arr[r];
        int i = p;
        /**
         * 遍历p到r之间的数据，比pivot小的全部放左边
         */
        for (int j = p; j < r; j++) {
            if (arr[j] < pivot) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }
        }
        /**
         * 循环结束，i的位置即为分区点
         */
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }
}
