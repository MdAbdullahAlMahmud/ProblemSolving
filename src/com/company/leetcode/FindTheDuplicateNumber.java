package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindTheDuplicateNumber {


    public static void main(String[] args) {

        int arr[] = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return  nums[i];
            }else {
                map.put(nums[i],nums[i]);
            }

        }
        return -1;
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicateList = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                duplicateList.add(nums[i]);
            }else {
                map.put(nums[i],nums[i]);
            }

        }
        return duplicateList;
    }


}
