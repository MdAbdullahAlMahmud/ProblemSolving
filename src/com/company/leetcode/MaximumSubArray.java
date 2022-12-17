package com.company.leetcode;

public class MaximumSubArray {


    public static void main(String[] args) {

        int arr [ ] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {

        int max_sum =  nums[0];
        int current_sum = max_sum;

        for (int i = 1; i < nums.length; i++) {

            current_sum = Math.max(current_sum + nums[i] , nums[i]);
            max_sum = Math.max(current_sum,max_sum);
        }


        return max_sum;
    }



}
