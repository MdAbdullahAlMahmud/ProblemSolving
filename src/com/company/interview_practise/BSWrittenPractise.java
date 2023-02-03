package com.company.interview_practise;

public class BSWrittenPractise {

    public static void main(String[] args) {

        int n = 6 ;
        //System.out.println(n+" is  Prime " + primeNumber(n));

        int rev = 321;
       // System.out.println(rev +"Rev "  + reverseNumber(rev));


        System.out.println("Is Palindrome " + checkPalindrome("100001"));
    }


    public  static  boolean primeNumber(int n){

        if (n == 2 ){
            return  true;
        }


        int middle = n/2;

        for (int i = 2 ; i <= middle ; i++){
            if (n%i == 0 )return  false;
        }

        return  true;

    }


    public  static  int reverseNumber(int n ){
        int rev = 0  ;
        while (n!=0){
            int mod = n%10;
            rev = (rev*10)+ mod;
            n = n/10;
        }
        return rev;
    }


    public static  boolean checkPalindrome(String word){

        int length = word.length();

        word = word.toLowerCase();
        int starting = 0 , ending = length-1;

        while (starting<=ending){

            if (word.charAt(starting) != word.charAt(ending)){
                return  false;
            }
            starting ++;
            ending--;

        }

        return  true;




    }
}
