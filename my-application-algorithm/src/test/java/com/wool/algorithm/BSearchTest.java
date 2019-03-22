package com.wool.algorithm;

import com.wool.algorithm.bsearch.BSearch;
import org.junit.Test;

/**
 * @Author wanglin
 * @Date 2019/3/12
 */
public class BSearchTest {

    @Test
    public void testBSearch(){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int index = BSearch.bsearch(arr, arr.length, 3);
        System.out.println(index);
    }
}
