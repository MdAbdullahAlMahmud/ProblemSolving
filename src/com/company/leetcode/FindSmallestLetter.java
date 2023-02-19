package com.company.leetcode;

import java.util.HashMap;

public class FindSmallestLetter {

    public static void main(String[] args) {

        char letters[] = {'a','b','c','d','e','f','g'};
        System.out.println("Output " +  nextGreatestLetterV2(letters,'c'));
    }

    public static  char nextGreatestLetter(char[] letters, char target) {

        int arr[] = new int[26];
        HashMap<Integer,Character> map = new HashMap<>();
        for (char letter : letters) {
            arr[(int)letter - 97]=1;
            map.put((int)letter,letter);
        }

        int expectedValue = -1;
         for (int i = 0; i < arr.length; i++) {
            if (i + 97 > (int)target  && arr[i] == 1){
                expectedValue = i + 97 ;
                break;
            }
        }

        return map.getOrDefault(expectedValue,letters[0]) ;
    }

    public static char nextGreatestLetterV2(char[] letters, char target) {

        char result = letters[0];
        int start = 0 ;
        int end = letters.length - 1 ;

        while (start<=end){
            int mid = (start + end )/2;
            if (target == letters[mid]){
                start = mid+1;
            }else if (target >letters[mid]){
                start = mid +1;
            }else if(target<letters[mid]) {
                result = letters[mid];
                end = mid - 1 ;
            }

        }

        return  result;

    }
}
