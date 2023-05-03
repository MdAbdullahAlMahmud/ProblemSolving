package com.company.leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_The_Difference_Of_Two_Array {

    public static void main(String[] args) {

        int[] num1 = {1,2,3,3};
        int[] num2 = {1,1,2,2};
        List<List<Integer>> ans = findDifference(num1,num2);

        for (List<Integer> list : ans){
            System.out.println(list.toString());
        }

    }


    public static  List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstArrray = new ArrayList<>();
        List<Integer> secondArrray = new ArrayList<>();

        HashMap<Integer,Integer> firstMap = new HashMap<>();
        HashMap<Integer,Integer> secondMap = new HashMap<>();


        for (int i : nums1) {
            firstMap.putIfAbsent(i,i);
        }

        for (int i : nums2) {
            secondMap.putIfAbsent(i,i);
        }

        for (Integer i : firstMap.values()){
            if (!secondMap.containsKey(i)){
                firstArrray.add(i);
            }
        }

        for (Integer i : secondMap.values()){
            if (!firstMap.containsKey(i)){
                secondArrray.add(i);
            }
        }
        ans.add(firstArrray);
        ans.add(secondArrray);

        return ans;


    }
}
