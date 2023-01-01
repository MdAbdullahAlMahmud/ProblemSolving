package com.company.leetcode;

public class MiddleOfLinkedList {


    public static void main(String[] args) {

        /*
        ListNode listNode = new ListNode();

        listNode.insert(1);
        listNode.insert(2);
        listNode.insert(3);
        listNode.insert(4);
        listNode.insert(5);


        int count = 0 ;
        ListNode tempHead = listNode.head;
        ListNode midTempHead = listNode.head;

        while (tempHead!=null){
            tempHead = tempHead.next;
            count++;
        }
        System.out.println("\n Middle "+ count/2);

        int index=0;
        int middlePoint = (int)count/2;

        while (listNode.head!=null){

            if(index>=middlePoint){

                System.out.print(" "+ listNode.head.val);
            }
            listNode.head = listNode.head.next;
            index++;
        }


        System.out.println("Middle node value "+ middleNode(midTempHead).val );
        System.out.println("Middle node value Pointer"+ middleNodeV2(midTempHead).val );
        System.out.println("Middle node value Pointer Practise "+ middleNodePractise(midTempHead).val );*/

        ListNode1 listNode1 = new ListNode1();

        listNode1.insert(1);
        listNode1.insert(2);
        listNode1.insert(3);
        listNode1.insert(4);
        listNode1.insert(5);
        reverseList(listNode1.head);

    }

    private  static ListNode1 reverseList(ListNode1 head){

        ListNode1 tempHead = head;
        ListNode1 shiftNode = tempHead ;

        int count = 0 ;


        while (tempHead!=null && tempHead.next != null){
            System.out.println(tempHead.toString() +" - >  " + tempHead.val);
            shiftNode = tempHead;
            // tempHead
            // current block address
            tempHead = tempHead.next;
          //  tempHead = tempHead.next;
        }

       return  tempHead;

    }
    public static ListNode1 middleNodeV2(ListNode1 head) {
        ListNode1 slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode1 middleNode(ListNode1 head) {

        ListNode1 middleNode = null;

        ListNode1 tempHead = head;
        int count = 0 ;
        while (tempHead!=null){
            tempHead = tempHead.next;
            count++;
        }

        int index=0;
        int middlePoint = (int)count/2;

        ListNode1 tHead = head;
        while (tHead!=null){

            if(index>=middlePoint){
                middleNode = tHead;
                return  middleNode;
            }
            tHead = tHead.next;
            index++;
        }

        return middleNode;

    }
    public static ListNode1 middleNodePractise(ListNode1 head){
        if (head ==null) return  head;

        ListNode1 slow = head , fast= head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }

}
class ListNode1 {
     int val;
     ListNode1 next;

    public ListNode1() {

    }


    ListNode1 head = null;

    public void  insert(int val){

        if (head == null){
           ListNode1 node = new ListNode1();
            node.val = val;
            node.next = null;
            head = node;
        }else {

            ListNode1 node = new ListNode1();
            node.val = val;


            node.next = head;
            head = node;

        }


    }
}