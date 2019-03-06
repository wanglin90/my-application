package com.wool.algorithm;

import com.wool.algorithm.sort.QuickSort;
import org.junit.Test;

/**
 * @Author wanglin
 * @Date 2019/3/5
 */
public class QuickSortTest {

    @Test
    public void testQuick(){
        int[] arr = new int[]{4, 5, 6, 1, 3, 2};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\r\n");
        QuickSort.sort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
