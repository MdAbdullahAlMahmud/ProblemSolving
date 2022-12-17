package com.company.gfg;

public class MaxSubArray {


    public static void main(String[] args) {
        int n = 4;
        int Arr[] = {-1,-2,-3,-4};
        maxSubarraySum(Arr,n);

    }

    public static long maxSubarraySum(int arr[], int n){
        //Time Complexity O(N)
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(currentSum+arr[i],arr[i]);
            maxSum = Math.max(maxSum,currentSum);

        }
        return  maxSum;
    }
}
