package com.company.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {


    public static void main(String[] args) {

        int arr[] = {-3,-1,0,0,0,3,3};
        System.out.println( "\nSize  " + removeDuplicates(arr));


    }
    public static int removeDuplicates(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int[] arr = new int[nums.length];
        int index = 0 ;

        for (int i = 0; i < nums.length; i++) {

            if (map.get(nums[i])==null){
                arr[index] = nums[i];
                index++;
                map.put(nums[i],1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
            //System.out.print(" " + nums[i]);
        }

        return  index ;
    }

}
