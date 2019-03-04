package com.wool.algorithm;

import com.wool.algorithm.sort.BubbleSort;
import org.junit.Test;

/**
 * @Author wanglin
 * @Date 2019/3/4
 */
public class BubbleSortTest {

    @Test
    public void testBubbleSort(){
        int[] arr = new int[]{4, 5, 6, 1, 3, 2};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        BubbleSort.sort(arr, arr.length);
        System.out.println("\r\n");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
