package com.company.leetcode;

import java.util.HashMap;

public class TwoSum2InputArrayIsSorted {

    public static void main(String[] args) {

        int arr [] = {2};

        int target = 9;
        int ans [] = twoSumV2(arr,target);
        System.out.println("[ "+ ans[0] + " , "+ ans[1] + " ] ");

    }
    public static int[] twoSum(int[] numbers, int target) {

        int arr[] = new int[2];
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            if (map.get((target - numbers[i])) !=null){
                arr[1] = i+1;
                arr[0] = map.get((target - numbers[i]))+1;
            }else {
                map.put(numbers[i],i);
            }
        }

        return  arr;
    }

    public static int[] twoSumV2(int[] numbers, int target) {
        int ans[] = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while (start!=end){

            if (numbers[start] + numbers[end] > target) {
                end--;
            }else if (numbers[start] + numbers[end] <target){
                start++;
            }else if (numbers[start] + numbers[end] == target){
                ans[0] =start+1;
                ans[1] = end+1;
                return ans;
            }
        }

        return  ans;
    }

}
