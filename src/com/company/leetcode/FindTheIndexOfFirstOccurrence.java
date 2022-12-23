package com.company.leetcode;

public class FindTheIndexOfFirstOccurrence {

    public static void main(String[] args) {

        String haystack = "leetcode", needle = "leeto";
        System.out.println("Index "+ strStr(haystack,needle));

    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
