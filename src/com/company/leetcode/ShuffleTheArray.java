package com.company.leetcode;

public class ShuffleTheArray {

    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3};

        int arr[] = shuffle(nums,3);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }


    public static int[] shuffle(int[] nums, int n) {

        int index = 0 ;
        int[] shuffle = new int[2*n];
        for (int i = 0; i < n; i++) {
            shuffle[index++] = nums[i];
            shuffle[index++] = nums[n+i];
        }

        for (int i = 0; i < 2*n ; i++) {
            nums[i] =shuffle[i];
        }

        return  nums;
    }
}
