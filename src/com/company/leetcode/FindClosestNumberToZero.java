package com.company.leetcode;

public class FindClosestNumberToZero {

    public static void main(String[] args) {

        int arr [] = {-100000,-100000};
        System.out.println("Number " + findClosestNumber(arr));
    }
    public static int findClosestNumber(int[] nums) {

        int min = 0;

        for (int i = 0; i < nums.length; i++) {

            int diff = nums[i] ;
            if (diff < 0 )diff = - diff;

            if (i==0) min = diff;

            if (diff<min) min = diff;

        }
        return  min;

    }
}
