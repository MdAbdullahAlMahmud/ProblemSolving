package com.company;

public class ListNode {

     public int val;
      public ListNode next;

    private ListNode head;

    public ListNode() {
    }


    public   void  insert(int val){
        if (head==null) {
            ListNode node = new ListNode();
            node.val = val;
            node.next = null;
            head = node;
        }else{
            ListNode tempNode = head;
            while (tempNode.next!=null){
                tempNode= tempNode.next;
            }
            ListNode node = new ListNode();
            node.val = val;
            node.next =null;
            tempNode.next = node;
        }


    }


    public   void  printListNode(){
        ListNode tempNode = head;
        while (tempNode!=null){
            System.out.print(" "+ tempNode.val);
            tempNode= tempNode.next;
        }

    }

    public ListNode getHeadNode(){return head;}
}

