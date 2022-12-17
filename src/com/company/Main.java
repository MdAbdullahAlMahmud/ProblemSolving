package com.company;

public class Main {

    public static void main(String[] args) {

       int nums[] = {3,5,6,8,4,5,9,5,8,4,5,8,4};
       int target = 10;

       int ans [] = twoSum(nums,target);

       System.out.println("["+ans[0]+","+ans[1]+"]");


    }
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];

        int length = nums.length;
        for (int i = 0; i <length ; i++) {

            for (int j = i+1; j < length; j++) {

                if (nums[i] + nums[j] == target){
                   // System.out.println("Match "+nums[i] + " + "+ nums[j] +" = "+ target);
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }

        }

        System.out.println();
        return ans;
    }
}
