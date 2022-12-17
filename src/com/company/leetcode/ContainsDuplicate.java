package com.company.leetcode;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println("Duplication " + containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {

        boolean isDuplication = false;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return  true;
            }else {
                map.put(nums[i],nums[i]);
            }

        }
        return isDuplication;
    }

}
