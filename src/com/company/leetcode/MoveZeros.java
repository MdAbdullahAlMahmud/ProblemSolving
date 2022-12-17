package com.company.leetcode;

public class MoveZeros {
    public static void main(String[] args) {

        int arr[] = {12,2,0,3};
        moveZeroes2(arr);
    }
    public static void moveZeroes2(int[] nums) {

        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void moveZeroes(int[] nums) {


        int zero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)zero++;
        }
        int[] newArray = new int[nums.length];
        int index = 0 ;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] !=0){
                newArray[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < zero; i++) {
            newArray[index] = 0;
            index++;
        }


        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArray[i];
            index++;
        }

/*
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+ nums[i]);
        }*/




    }
}
