package com.company.gfg;

import java.util.HashMap;

public class CountPair {
    public static void main(String[] args) {

       int  N = 4, K = 3;
        int arr[] = {1, 2, 2, 1};

        System.out.println("Count "+ getPairsCount(arr,N,K));
    }
    public static int getPairsCount(int[] arr, int n, int k) {

        int count = 0 ;
        HashMap<Integer , Integer > map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (map.containsKey(k-arr[i])){

                count += map.get(k-arr[i]);

            }
            map.putIfAbsent(arr[i],0);
            map.put(arr[i],map.get(arr[i])+1);

        }
        return  count;


    }
}
