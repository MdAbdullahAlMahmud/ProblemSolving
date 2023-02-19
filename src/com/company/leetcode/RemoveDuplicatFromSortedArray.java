package com.company.leetcode;

import com.company.ListNode;

import java.util.HashMap;

public class RemoveDuplicatFromSortedArray {


    public static void main(String[] args) {

        ListNode listNode =  new ListNode();
        listNode.insert(1);
        listNode.insert(1);
        listNode.insert(2);
        listNode.insert(5);
        listNode.insert(6);
        listNode.insert(6);



       ListNode headNode =  deleteDuplicates(listNode.getHeadNode());

        System.out.println("\n\n\nNew output");
        while (headNode!=null){
            System.out.print(" "+ headNode.val);
            headNode = headNode.next;
        }

    }

    public static  ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;
        HashMap<Integer,Integer> uniqueList = new HashMap<>();
        while (temp!=null){
         //   System.out.print(" "+ temp.val);
            uniqueList.put(temp.val,uniqueList.getOrDefault(temp.val,0) +1);
            temp = temp.next;
        }



       /* System.out.println();
        uniqueList.forEach((key, value) -> {
            System.out.println(key+" -> " + value);
        });*/

        ListNode current = head, prev = head;

        while (current!=null){
            if (uniqueList.get(current.val)>=1){
               // System.out.print(" "+ current.val);
                uniqueList.put(current.val,0);
                prev= current;
            }else {
                prev.next = current.next;
            }
            current = current.next;
        }


        return  head;
    }


}
