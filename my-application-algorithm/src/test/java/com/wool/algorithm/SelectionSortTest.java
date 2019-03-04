package com.wool.algorithm;

import com.wool.algorithm.sort.SelectionSort;
import org.junit.Test;

/**
 * @Author wanglin
 * @Date 2019/3/4
 */
public class SelectionSortTest {

    @Test
    public void testSelectionSort(){
        int[] arr = new int[]{4, 5, 6, 1, 3, 2};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\r\n");
        SelectionSort.sort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
