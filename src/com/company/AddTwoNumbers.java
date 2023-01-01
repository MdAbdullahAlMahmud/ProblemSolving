package com.company;


public class AddTwoNumbers {


    public static void main(String[] args) {

        /*insertNode(5);
        insertNode(51);
        insertNode(10);
        insertNode(15);

        print(head );
        */
        ListNode2 linkedList = new ListNode2();
        linkedList.insertNode(2);
        linkedList.insertNode(4);
        linkedList.insertNode(3);

        System.out.println("---------------------");
        ListNode2 l2 = new ListNode2();
        l2.insertNode(5);
        l2.insertNode(6);
        l2.insertNode(4);


        // without function;
        System.out.println(linkedList.headNode());
        System.out.println(l2.headNode());

//        addTwoNumbers(linkedList.headNode(),l2.headNode());

        //----------first LinkList-------------
        ListNode2 current = linkedList.headNode();


        StringBuilder firstNumber = new StringBuilder();
        while (current.next!=null){
           // System.out.println(current.val);
            firstNumber.append(current.val);
            current = current.next;
        }
        firstNumber.append(current.val);

        int firstNum = Integer.parseInt(String.valueOf(firstNumber.reverse()));


        System.out.println("FirstNumber "+firstNum);

        //----------first LinkList-------------


        //----------Second LinkList-------------
        ListNode2 current2 = l2.headNode();


        StringBuilder secondNumber = new StringBuilder();
        while (current2.next!=null){
            // System.out.println(current.val);
            secondNumber.append(current2.val);
            current2 = current2.next;
        }
        secondNumber.append(current2.val);

        int secondNum = Integer.parseInt(String.valueOf(secondNumber.reverse()));


        System.out.println("Second Number "+secondNum);

        //----------second LinkList-------------


        int sum = firstNum+secondNum;

        StringBuilder summation = new StringBuilder();
        summation.append(sum);
        String mainAns = String.valueOf(summation.reverse());
        System.out.println("Ans " + mainAns);

        ListNode2 sumLinkedList = new ListNode2();
        for (int i = 0; i < mainAns.length(); i++) {
            sumLinkedList.insertNode(Integer.parseInt(String.valueOf(mainAns.charAt(i))));
        }


        // trying to print final linked list
        System.out.println("Final Result");
        ListNode2 result = sumLinkedList.headNode();

        while (result.next!=null){
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val);

    }

    public static ListNode2 addTwoNumbers(ListNode2 linkedList, ListNode2 l2) {

        ListNode2 current = linkedList;
        StringBuilder firstNumber = new StringBuilder();
        while (current.next!=null){
            firstNumber.append(current.val);
            current = current.next;
        }
        firstNumber.append(current.val);
       String firstReverseString = String.valueOf(firstNumber.reverse());



        ListNode2 current2 = l2;
        StringBuilder secondNumber = new StringBuilder();
        while (current2.next!=null){
            secondNumber.append(current2.val);
            current2 = current2.next;
        }
        secondNumber.append(current2.val);
        String secondReverseString = String.valueOf(secondNumber.reverse());

        String sum = addTwoStringNumbers(firstReverseString,secondReverseString);


        StringBuilder summation = new StringBuilder();
        summation.append(sum);
        String mainAns = String.valueOf(summation.reverse());
        ListNode2 head = new ListNode2();

        ListNode2 temp =null;

        for (int i = 0; i < mainAns.length(); i++) {

            int value = Integer.parseInt(String.valueOf(mainAns.charAt(i)));

            ListNode2 node = new ListNode2();
            node.val = value;
            node.next = null;


            if (i==0){
                head = node;
                temp = head;
            }else {
                while (temp.next!=null){
                    temp = temp.next;
                }
                temp.next = node;
            }

        }



        return  head;
    }
    public static String addTwoStringNumbers(final String n1, final String n2) {
        StringBuilder sb = new StringBuilder();
        int carry =0;
        byte[] nb1; byte[] nb2;
        if (n1.length() > n2.length()){
            nb1 = n1.getBytes();
            nb2 = n2.getBytes();
        } else {
            nb2 = n1.getBytes();
            nb1 = n2.getBytes();
        }

        int maxLen=n1.length()>=n2.length()?n1.length():n2.length();
        for (int i = 1; i <= maxLen ; i++) {
            int a = nb1.length-i >= 0 ? nb1[nb1.length-i] - 48 : 0;
            int b = nb2.length-i >= 0 ? nb2[nb2.length-i] - 48 : 0;
            int result = a + b + carry;

            if (result >= 10){
                carry = 1;
                result = result-10;
            } else {
                carry = 0;
            }
            sb.insert(0, result);
        }
        if(carry>0){
            sb.insert(0, carry);
        }
        return sb.toString();
    }


}
class ListNode2 {
     int val;
     ListNode2 next;
    private ListNode2 head=null;
    private ListNode2 current=null;

    public ListNode2 headNode(){
        return  head;
    }
    public  void insertNode(int value){


        ListNode2 node = new ListNode2();
        node.val = value;
        node.next = null;

        if (head == null){
            head = node;
            current = head;
        }else {
            while (current.next!=null){
                current = current.next;
            }

            current.next = node;
        }


    }
    public  void  print(){
        ListNode2 current = head;
        while (current.next!=null){
            System.out.println(current.val+" ");
            current = current.next;
        }
        System.out.println(current.val+" ");

    }





}

