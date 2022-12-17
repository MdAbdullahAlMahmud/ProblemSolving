package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {

        int arr[] = {1,2,3,1,1,3};
        System.out.println("Ans " + numIdenticalPairs(arr));
        numIdenticalPairsV2(arr);
    }
    public static int numIdenticalPairs(int[] nums) {

        int count = 0 ;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i<j){
                    count++;
                }

            }
        }
        return  count;
    }
    public  static  int numIdenticalPairsV2(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
           // res += map.get(n) - 1;  // addtional pair can be formed btw n and all previous v == n;
        }

        map.entrySet().forEach(integerIntegerEntry ->
                        System.out.println(""+ integerIntegerEntry.getKey()  + " - > " + integerIntegerEntry.getValue())
                );

        return res;
    }


}
