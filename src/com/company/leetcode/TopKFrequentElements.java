package com.company.leetcode;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {

        int arr[] = {1,1,1,2,2,3,3,3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequentV1(arr, k)));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            if (!map.containsKey(num))map.put(num,0);
            int count = map.get(num);
            count++;
            map.put(num,count);
        }
        ArrayList<Integer> valueList = new ArrayList<>();
        map.forEach((key,value)->{
          valueList.add(value);
          System.out.println(key +" -> "+ value);
        });
        Collections.sort(valueList);
        System.out.println(valueList.toString());
        int output[] = new int[k];
        for (int i =0 ;i<k; i++){
            output[i] = valueList.get(i);
        }

        return  /*valueList.subList(0,k).stream().mapToInt(Integer::intValue).toArray()*/output;
    }
    public static int[] topKFrequentV1(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            if (!map.containsKey(num))map.put(num,0);
            int count = map.get(num);
            count++;
            map.put(num,count);
        }

        List<Map.Entry<Integer, Integer>> nlist = new ArrayList<>(map.entrySet());

        nlist.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));


        System.out.println("nList " + nlist.toString());

        int output[] = new int[k];
        for (int i =0 ;i<k; i++){
            output[i] = nlist.get(i).getKey();
        }

        return  output;
    }

}
