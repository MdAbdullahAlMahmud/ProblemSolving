package com.company.leetcode;

public class LongestCommonPrefix {


    //flower
    //flow
    //flight

    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        longestCommonPrefix(strs);
    }


    public static String longestCommonPrefix(String[] strs) {

        if (strs==null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {

            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i>=strs[j].length() || c != strs[j].charAt(i)){
                    return  strs[j].substring(0,i);
                }
            }
        }

        return strs[0];

    }
}
