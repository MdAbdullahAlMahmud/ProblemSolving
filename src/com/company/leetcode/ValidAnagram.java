package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {

    public static void main(String[] args) {

        String msg = "anagram";
        System.out.println("Is Anagram " +isAnagram(msg,msg));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() == t.length()) {
            HashMap<Character, Integer> magMap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                magMap.put(s.charAt(i), magMap.get(s.charAt(i)) != null ? magMap.get(s.charAt(i)) + 1 : 1);
            }

            magMap.forEach((character, integer) -> {

                System.out.println(character+ " -> " + integer);
            });

            HashMap<Character, Integer> ranMap = new HashMap<>();
            for (int i = 0; i < t.length(); i++) {
                ranMap.put(t.charAt(i), ranMap.get(t.charAt(i)) != null ? ranMap.get(t.charAt(i)) + 1 : 1);
            }
            System.out.println("-----------------");

            Integer sum = 0 ;
            ranMap.forEach((character, integer) -> {

                System.out.println(character+ " -> " + integer);
            });

            for (Map.Entry<Character, Integer> entry : ranMap.entrySet()) {

                sum+=entry.getValue();
            }

            System.out.println("Total Length " + sum);


            System.out.println( " Ran " + ranMap.entrySet().size());
            System.out.println( " Mag " + magMap.entrySet().size());

            for (Map.Entry<Character, Integer> entry : ranMap.entrySet()) {

                Character character = entry.getKey();
                if (magMap.get(character) != null && ranMap.get(character) !=null) {
                    if (!Objects.equals(magMap.get(character), ranMap.get(character))){
                        return  false;
                    }
                } else {
                    return false;
                }
            }


            return  true;

        } else {
            return false;
        }
    }

    public static  boolean isAnagramV2(String s , String t){

        int arr[] = new int[26];

        for (int i = 0; i < s.length(); i++)arr[s.charAt(i) - 97] ++;
        for (int i = 0; i < t.length(); i++)arr[t.charAt(i) - 97] --;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=0){
                return false;
            }
        }

        return true;

    }

}
