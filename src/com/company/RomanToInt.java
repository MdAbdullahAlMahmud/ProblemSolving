package com.company;

import java.util.HashMap;

public class RomanToInt {


    public static void main(String[] args) {


        System.out.println("Value "+romanToInt("DM"));
    }


    public static int romanToInt(String roman) {
         HashMap<String, Integer>romanValue;
        romanValue = new HashMap<>();
        romanValue.put("I",1);
        romanValue.put("V",5);
        romanValue.put("X",10);
        romanValue.put("L",50);
        romanValue.put("C",100);
        romanValue.put("D",500);
        romanValue.put("M",1000);
        int ans=0;
        int sum = 0 ;
        for (int index = 0; index < roman.length(); ) {

            String rm="",rmplus="";

            if (index+1 != roman.length()){
                rm = String.valueOf(roman.charAt(index));
                rmplus = String.valueOf(roman.charAt(index+1));
            }else {
                 rm = String.valueOf(roman.charAt(index));
                 rmplus = rm;
            }


            if (romanValue.get(rm) < romanValue.get(rmplus)){
                sum = romanValue.get(rmplus) -romanValue.get(rm);
                index+=2;
            }else {
                sum = romanValue.get(rm);
                index++;
            }

            ans+= sum;

        }

        return ans;

    }
}
