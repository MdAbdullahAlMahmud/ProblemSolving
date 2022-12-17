package com.company.leetcode;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2};

        rotate(arr,3);

    }

    public static void rotate(int[] nums, int k) {

        int arr[] = new int[nums.length];
        int arrLength = nums.length;

        if(nums == null || nums.length < 2){
            return;
        }
        int index = 0;
        for (int i = arrLength-k; i <arrLength; i++) {
            arr[index] = nums[i];
            index++;
        }

        for (int i = 0; i < arrLength-k; i++) {
            arr[index] = nums[i];
            index++;

        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        for (int num : nums) {
            System.out.print(num+" ");
        }



    }
}
