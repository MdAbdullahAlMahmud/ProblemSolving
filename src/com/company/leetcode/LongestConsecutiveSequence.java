package com.company.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {


    public static void main(String[] args) {
        int nums[]= {7,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length==0)return 0;
        int currentMaxLength =1;
        int maxLength = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] - nums[i] == 1){
                currentMaxLength++;
            }
            else if(nums[i+1] - nums[i] != 0){
                maxLength = Math.max(maxLength,currentMaxLength);
                currentMaxLength = 1 ;
            }

        }
        maxLength = Math.max(maxLength,currentMaxLength);
        return maxLength;
    }
}
