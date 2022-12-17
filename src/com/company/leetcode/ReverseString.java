package com.company.leetcode;

public class ReverseString {

    public static void main(String[] args) {

        char[] s = {'A'};
        reverseString(s);
    }
    public static  void reverseString(char[] s) {

        //Time Complexity O(n)

        int start = 0;
        int end = s.length-1;

        if (s.length==2){
            char startingChar = s[0];
            char endingChar = s[1];
            s[start] = endingChar;
            s[end] = startingChar;
        }else {
            while (start<=end){
            char startingChar = s[start];
            char endingChar = s[end];
            s[start] = endingChar;
            s[end] = startingChar;
            start++;
            end--;

            }
        }
        for (char c : s) {
            System.out.print(c+" ");
        }



    }
}
