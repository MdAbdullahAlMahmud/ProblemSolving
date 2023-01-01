package com.company.leetcode;

import com.company.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {

        ListNode listNode = new ListNode();

        listNode.insert(1);
        listNode.insert(2);
        listNode.insert(3);
        listNode.insert(4);
        listNode.insert(5);
        listNode.printListNode();

        ListNode headNode = listNode.getHeadNode();
        ListNode revNode = reverseList(headNode);

        System.out.println();
        while (revNode !=null){
            System.out.println(" " + revNode.val);
            revNode =revNode.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if ( head == null )return head;
        ListNode tempNode = head.next;
        head.next = null;
        while (tempNode!=null){
            ListNode t = tempNode.next;
            tempNode.next = head;
            head = tempNode;
            tempNode = t;
        }
        return  head;
    }
}
