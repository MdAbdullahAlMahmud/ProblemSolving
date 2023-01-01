package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = {2,2,1,1,1,2,2};
        System.out.println("Ans "+  majorityElement(arr));


    }
    public static int majorityElement(int[] nums) {

        HashMap<Integer , Integer> magMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            magMap.put(nums[i],magMap.get(nums[i]) !=null?magMap.get(nums[i]) + 1 : 1);
        }

        int max = 0;
        int key =0;
        for (Map.Entry<Integer, Integer> set : magMap.entrySet()) {

            if (set.getValue() > max){
                max = set.getValue();
                key = set.getKey();
            }

        }

        return  key ;
    }

}
