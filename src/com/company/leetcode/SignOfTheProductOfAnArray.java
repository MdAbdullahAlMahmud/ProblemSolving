package com.company.leetcode;

import java.awt.desktop.PreferencesEvent;

public class SignOfTheProductOfAnArray {


    public static void main(String[] args) {

        int arr[] = {-1};
        System.out.println("Ans -> "+ arraySignV2(arr));
    }


    public static int arraySign(int[] nums) {


        int x = 0 ;
        for (int item : nums){
            if (item<0)x++;

            if (item == 0 ){
                x = 0;
                break;
            }
        }

        System.out.println("Nagative Count " + x);

        if (x == 0)return 0;
        if (x %2==0){
            return 1;
        }else {
            return  -1;
        }

    }

    public static int arraySignV2(int[] nums){

        int x = 1 ;
        for (int i : nums){
            if (i>0) x*=1;
            else if (i<0) x*=-1;
            else {
                x*=0;
                break;
            }
        }



       /* if (x > 0) return 1;
        else if (x < 0) return -1;
        else return 0;
*/
        //More Efficient
        return  x;
    }

}
