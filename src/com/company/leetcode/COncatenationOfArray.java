package com.company.leetcode;

public class COncatenationOfArray {


    public static void main(String[] args) {

        int arr [] = {1,2,3};
        getConcatenation(arr);
    }

    public static int[] getConcatenationV2(int[] nums) {

        int x2 = 2 * nums.length;
        int arr [] = new int[x2];

        for (int i = 0; i < x2 ; i++) {

            arr[i] = nums[i% nums.length];
        }


        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }*/
        return  arr;
    }
    public static int[] getConcatenation(int[] nums) {

        int x2 = 2 * nums.length;
        int arr[] = new int[x2];

        int index = 0 ;
        for (int num : nums) {
            arr[index] = num;
            index++;
        }
        for (int num : nums) {
            arr[index] = num;
            index++;
        }


        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }*/
        return  arr;
    }

}
