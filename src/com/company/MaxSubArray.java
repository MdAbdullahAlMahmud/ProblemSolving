package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxSubArray {

    public static void main(String[] args) {
        int arr[] = {1,-3,2,1,-1};

        long result =0;
        long sum  = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (i==0){
                result = sum;
            }
            if (sum>result){
                result = sum;
            }
            for ( j = j+i+1; j < arr.length; j++) {
                sum= sum+arr[j];
                if (sum>result){
                    result = sum;
                }
            }
            sum = 0;j=0;
        }
        System.out.println("Result "+result);

    }
}
