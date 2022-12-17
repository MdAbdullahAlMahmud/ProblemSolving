package com.company.leetcode;

public class ReverseInteger {


    public static void main(String[] args) {

        reverse(1534236469);
    }

    public static int reverse(int x) {

        int vagfol  = x;
        long ans = 0 ;
        while (vagfol !=0){
            int ad = vagfol/10;
            ans  = ans*10 + vagfol%10;
            vagfol =ad;
        }
        //System.out.println("Ans -> "+ ans);

        if(ans >= Integer.MIN_VALUE && ans <= Integer.MAX_VALUE)
            return (int)ans;
        else
            return 0;



    }
}
