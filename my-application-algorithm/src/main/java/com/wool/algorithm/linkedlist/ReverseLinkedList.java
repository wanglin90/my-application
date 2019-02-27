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

    public static void main(String[] args) {
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


        Node newNode = reverse(node1);
        System.out.println(newNode.toString());

    }
}
