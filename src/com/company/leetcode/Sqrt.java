package com.company.leetcode;

public class Sqrt {


    public static void main(String[] args) {
        System.out.println("Sqrt is " + mySqrt(9));
    }
    public static int mySqrt(int n) {
        int start = 1 ;
        int end = n ;

        while (start<=end){

            int middle = start + (end - start )/2;

            if (middle == n/middle) return middle;

            if (middle > n/middle ){
                end = middle -1;
            }
            if (middle< n /middle) {
                start = middle+1;
            }
        }
        return  end;

    }

}
