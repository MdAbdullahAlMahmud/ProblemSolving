package com.company.leetcode;

import com.company.ListNode;

public class MergeTwoSortedList {

    public static void main(String[] args) {

        ListNode listNode =  new ListNode();
        listNode.insert(1);
        listNode.insert(2);
        listNode.insert(4);

        ListNode list2 = new ListNode();
        list2.insert(1);
        list2.insert(3);
        list2.insert(4 );



        ListNode headNode = mergeTwoLists(listNode,list2);


        while (headNode!=null){
            System.out.print(headNode.val + " ");
            headNode= headNode.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode mergedNode = new ListNode();
        ListNode currentNode = mergedNode;

        while (list1!=null && list2!=null){

            if (list1.val < list2.val){
                currentNode.next = list1;
                list1 =list1.next;
            }else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode =currentNode.next;
        }

        if (list1!=null) currentNode.next = list1;
        if (list2!=null) currentNode.next = list2;

        return mergedNode.next;


    }
}
