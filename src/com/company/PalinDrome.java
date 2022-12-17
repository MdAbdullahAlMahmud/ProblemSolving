package com.company;

public class PalinDrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {

        String initialString = String.valueOf(x);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(initialString);

        String reverseString = String.valueOf(stringBuilder.reverse());

        System.out.println("Initial String "+ initialString);
        System.out.println("Reverse String "+ reverseString);



        return  initialString.equals(reverseString);
    }
}
