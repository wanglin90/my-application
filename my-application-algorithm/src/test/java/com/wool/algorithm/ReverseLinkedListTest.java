package com.wool.algorithm;

import com.wool.algorithm.linkedlist.Node;
import com.wool.algorithm.linkedlist.ReverseLinkedList;
import org.junit.Test;

/**
 * @Author wanglin
 * @Date 2019/3/4
 */
public class ReverseLinkedListTest {

    @Test
    public void testReverseLinkedList(){
        Node node1 = new Node();
        node1.setValue(1);

        Node node2 = new Node();
        node2.setValue(2);

        Node node3 = new Node();
        node3.setValue(3);

        Node node4 = new Node();
        node4.setValue(4);

        Node node5 = new Node();
        node5.setValue(5);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        System.out.println(node1.toString());


        Node newNode = ReverseLinkedList.reverse(node1);
        System.out.println(newNode.toString());
    }
}
