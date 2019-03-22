package com.wool.algorithm.bsearch;

/**
 * @Author wanglin
 * @Date 2019/3/12
 * 二分查找，时间复杂度O(lgn)。其核心思路就是找到p到r区间内中间位置mid，比中间位置大在右边找，比中间位置小在左边找。递归这个过程，每次寻找范围缩小一半。
 * [1,2,3,4,5,6]
 */
public class BSearch {

    public static int bsearch(int[] arr, int n, int value) {
        return binarySearch(arr, 0, n - 1, value);
    }

    private static int binarySearch(int[] arr, int low, int high, int value) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
