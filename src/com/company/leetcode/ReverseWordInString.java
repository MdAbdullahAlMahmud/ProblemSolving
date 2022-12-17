package com.company.leetcode;

public class ReverseWordInString {
    public static void main(String[] args) {

        System.out.println(reverseWords("Let's take LeetCode Contest"));

        //System.out.println('a' == ' ' );

    }



    public  static  String reverseString (String s){
        char[] arr = s.toCharArray();

        int start = 0;
        for (int i = 0; i < arr.length; i++) {


            char ch = arr[i];
            if (ch==' '){

                int end = i-1;
                System.out.println(" Start "+ start +"  End "+ end);

                while (start<end){
                    char startingChar = arr[start];
                    char endingChar = arr[end];
                    arr[start] = endingChar;
                    arr[end] = startingChar;
                    start++;
                    end--;
                }

                start = end+1;
                System.out.println(" Start V"+ start +"  End V "+ end);

            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print (" "+ arr[i]);

        }

        return  "asdf";

    }
    public static String reverseWords(String s) {

        char[] str = s.toCharArray();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            count++;
            if(str[i] == ' '){
                reverse(str, i-count+1, i-1);
                count = 0;
            }

            if(i == s.length()- 1){
                reverse(str, i-count+1, i);
                count = 0;
            }

        }

        return new String(str);

    }
    private static void reverse(char[] str, int start, int end) {
        while (start<end){
            char startingChar = str[start];
            char endingChar = str[end];
            str[start] = endingChar;
            str[end] = startingChar;
            start++;
            end--;
        }
    }
}
