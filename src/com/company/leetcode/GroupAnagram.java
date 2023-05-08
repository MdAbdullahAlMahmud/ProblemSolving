package com.company.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class GroupAnagram {

    public static void main(String[] args) {

       String arr[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagramsV1(arr));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {


        HashMap<Integer, List<String>> maplist = new HashMap<>();

        for (String word : strs){

            int sumOfChar = 0;
            for (char c : word.toCharArray()){
                sumOfChar+=(int) c;
            }
            List<String> currentListWithThatSum = maplist.getOrDefault(sumOfChar, new ArrayList<>());
            currentListWithThatSum.add(word);
            maplist.put(sumOfChar,currentListWithThatSum);

            System.out.println(word + " => " + sumOfChar);
        }

        List<List<String>> list = new ArrayList<>();

        for(Integer key: maplist.keySet()){
            list.add(maplist.get(key));
            System.out.println(key + ": " + maplist.get(key));
        }

        System.out.println("List Size " + list.size());

        return  list;
    }


    private  static List<List<String>> groupAnagramsV1(String strs[]){
        HashMap<String,List<String>> map = new HashMap<>();
        for (String item : strs){
            char arr[] = item.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if (!map.containsKey(key))map.put(key,new ArrayList<>());
            List<String> list = map.get(key);
            list.add(item);
            map.put(key,list);
        }
        return  new ArrayList(map.values());
    }

    private  static List<List<String>> groupAnagramsV2(String strs[]){
        HashMap<String,List<String>> map = new HashMap<>();
        for (String item : strs){
            char arr[] = item.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if (!map.containsKey(key))map.put(key,new ArrayList<>());
            map.get(key).add(item);
        }
        return  new ArrayList(map.values());
    }


}
