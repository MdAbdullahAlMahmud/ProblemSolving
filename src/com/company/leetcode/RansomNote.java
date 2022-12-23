package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        //String ransomNote = "aa", magazine = "aba";
        String ransomNote = "ehifb", magazine = "hhjdgjbhahaagihhhhhajjibjffhijehda";

        System.out.println("Ans "+ canConstruct(ransomNote,magazine));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character , Integer> magMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            magMap.put(magazine.charAt(i),magMap.get(magazine.charAt(i)) !=null?magMap.get(magazine.charAt(i)) + 1 : 1);
        }

        HashMap<Character , Integer> ranMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            ranMap.put(ransomNote.charAt(i),ranMap.get(ransomNote.charAt(i)) !=null?ranMap.get(ransomNote.charAt(i)) + 1 : 1);
        }

        for(Map.Entry<Character, Integer> entry : ranMap.entrySet()) {

            Character character = entry.getKey();
            Integer integer = entry.getValue();

            if(magMap.get(character)!=null && magMap.get(character) >= integer){
            }else {
                return  false;
            }
        }

        return true;
    }
}
