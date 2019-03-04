package com.wool.algorithm.linkedlist;

/**
 * @Author wanglin
 * @Date 2019/2/26
 * 链表反转
 */
public class ReverseLinkedList {

    public static Node reverse(Node head) {
        /**
         * 头节点是空，或者只有一个节点，返回自身
         */
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node newHead = null;
        Node curHead = head;
        Node p = curHead.getNext();

        while (p != null) {
            //当前node的next指向前一个node
            curHead.setNext(newHead);
            //指针向后移动
            newHead = curHead;
            curHead = p;
            p = p.getNext();
            curHead.setNext(newHead);
        }
        return curHead;
    }

}
