package com.company.leetcode;

import java.util.HashMap;

public class RemoveElement {

    public static void main(String[] args) {

        int arr[] = {3,2,2,3};
        System.out.println( "\nSize  " + removeElement(arr, 3));    }

    public static  int removeElement(int[] nums, int val) {


        HashMap<Integer,Integer> map = new HashMap<>();

        int[] arr = new int[nums.length];
        int index = 0 ;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val ){
                arr[index] = nums[i];
                index++;
                map.put(nums[i],1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
            System.out.print(" " + nums[i]);
        }

        return  index ;
    }
}
