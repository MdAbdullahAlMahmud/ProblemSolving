package com.company.leetcode;

public class RunningSum {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};


    }

    public static int[] runningSum(int[] nums) {
        int sum = 0 ;

        for (int i = 0; i <nums.length; i++) {

            sum+=nums[i];
            nums[i]= sum;
        }

        return nums;
    }
}
