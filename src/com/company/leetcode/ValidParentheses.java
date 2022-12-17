package com.company.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        isValid("{[[()]}");
    }
    public static boolean isValid(String s) {

        HashMap<String ,String> map = new HashMap<>();
        map.putIfAbsent("(",")");
        map.putIfAbsent("{","}");
        map.putIfAbsent("[","]");
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stringStack.add(String.valueOf(s.charAt(i)));
        }


        while (stringStack.indexOf(stringStack.peek()) == 0){
            for (int i = 0; i < stringStack.size(); i++) {
                if (map.get(stringStack.peek())==stringStack.peek()){
                    stringStack.remove(i);
                    stringStack.remove(stringStack.indexOf(stringStack.peek()));
                }

            }
        }


        System.out.println("After Remove "+stringStack.toString());
        return  true;

    }

}
