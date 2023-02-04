package com.company.interview_practise;

public class BSWrittenPractise {

    public static void main(String[] args) {

        int n = 6 ;
        //System.out.println(n+" is  Prime " + primeNumber(n));

        int rev = 321;
       // System.out.println(rev +"Rev "  + reverseNumber(rev));


       // System.out.println("Is Palindrome " + checkPalindrome("100001"));

        int num = 99;
      //  System.out.println( num+" Number Found " + searchNumber(num));

        int sqrt = 15 ;
        //System.out.println( sqrtRootNear(sqrt)+ " is the sqrt of " + sqrt);

        //System.out.println( sqrtRoot(sqrt)+ " is the near sqrt of " + sqrt);

        currencyProblem(868);
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
    private static   boolean  searchNumber(int n ){

        int start = 1 ;
        int end = 100 ;

        while (start!=end){

            int middle = (start + end )/2;

            if (middle == n)return true;

            if (middle > n ){
                end = middle ;
            }
            if (middle < n ) {
                start = middle+1;
            }
        }
        return  false;
    }

    private static   int   sqrtRoot(int n ){

        int start = 1 ;
        int end = n ;

        while (start!=end){

            int middle = (start + end )/2;

            if (middle*middle == n) return middle;

            if (middle*middle > n ){
                end = middle ;
            }
            if (middle *middle< n ) {
                start = middle+1;
            }
        }
        return  -1;
    }
    private static   int   sqrtRootNear(int n ){

        int start = 1 ;
        int end = n ;

        while (start<=end){

            int middle = start + (end - start )/2;

            if (middle == n/middle) {
                return middle;
            }/*else if (middle*middle > n ){
                end = middle -1;
            }*/
            else if (middle < n/middle ) {
                start = middle+1;
            }else {
                end = middle -1 ;
            }
        }
        return  end;
    }

    public static  int mySqrt(int x) {
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static  void  currencyProblem (int taka){

        int notes[] = {1000,500,100,50,10,5,1};

        int amount [] = new int[notes.length];
        int remain = taka ;
        for (int i = 0; i < 7; i++) {
            amount[i] = remain/notes[i];
            remain = taka%notes[i];
        }

        for (int i = 0; i < 7; i++) {
            if (amount[i]>0)
            System.out.println(notes[i] + " " + amount[i]);
        }


    }

}
