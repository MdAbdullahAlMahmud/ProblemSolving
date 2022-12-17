package com.company.gfg;

import java.util.HashMap;

public class SubarrayWithZeroSum {

    public static void main(String[] args) {


        int n = 5 ;
        int arr[] = {4,2,0,1,6};
        System.out.println("Match " + findsumH(arr,n));
    }


//Time Complexity O(n^2)
    static boolean findsum(int arr[],int n)
    {
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum==0){
                return  true;
            }
            for (int j = i+1; j < n; j++) {

                sum += arr[j];
                if (sum==0){
                    return  true;
                }
            }
            sum = 0;
        }

        return false;

    }
    static boolean findsumH(int arr[],int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum +=arr[i];

            if (sum == 0 || map.containsKey(sum)){
                return  true;
            }
            map.putIfAbsent(sum,i);

        }

        return false;

    }
}
