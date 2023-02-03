package com.company.leetcode;

public class AddBinary {
    public static void main(String[] args) {
        String a = "101";
        String b = "101";
        System.out.println("Ans "+ addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int aIndex =a.length() -1 , bIndex = b.length()-1 ;
        int curry = 0 ,sum = 0 ;
        while (aIndex >= 0 || bIndex >=0 ){

            if (aIndex >= 0) sum += (a.charAt(aIndex--) - '0');
            if (bIndex >= 0) sum += (b.charAt(bIndex--) - '0');

            stringBuilder.append(sum%2);
            curry = sum/2;
            sum = curry;

        }

        if (curry !=0 ) stringBuilder.append(curry);
        return  stringBuilder.reverse().toString();
    }
}
