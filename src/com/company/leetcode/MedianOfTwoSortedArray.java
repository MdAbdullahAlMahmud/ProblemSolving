package com.company.leetcode;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Formatter;
import java.util.Locale;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {

        int arr [] = {1,3};
        int arr2[] = {2,4};
      //  findMedianSortedArrays(arr,arr2);
        System.out.println("Ans " + mergeTwoSorted(arr,arr2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int nums[] = new int[nums1.length + nums2.length];

        double median = 0;

        int P1 = 0 ,P2 =  0;

        int index = 0 ;
        //{1,3}
        //{2,4,6}

        while (index != nums.length-1){
            if (nums1[P1]  <= nums2[P2]){
                nums[index] = nums1[P1];
                index ++ ;
                 P1 ++ ;
                 if (P1>=nums1.length)P1=P2;
            }else if(nums1[P1] >= nums2[P2]){
                nums[index] = nums2[P2];
                P2++;
                index++;
                if (P2>=nums2.length)P2=P1;


            }else {

                System.out.println(" Else working... ");
            }

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print( " " + nums[i] );
        }
        return  median;

    }



    public static double  mergeTwoSorted(int[] nums1, int[] nums2){

        double median = 0.0;
        int ans[] = new int[nums1.length+nums2.length];
        int index = 0 ;

        int P1 = 0 ;
        int P2 = 0 ;
        while (P1< nums1.length && P2 < nums2.length){

            if (nums1[P1]  <= nums2[P2]){

                ans[index] = nums1[P1];
                index++;
                System.out.print(" "+ nums1[P1]);
                P1 ++ ;
            }else if(nums1[P1] >= nums2[P2]){
                ans[index] = nums2[P2];
                index++;
                System.out.print(" "+ nums2[P2]);
                P2++;
            }else {
                System.out.println(" Else working... ");
            }
        }

       /* System.out.println("\nFirst Array " + P1);
        System.out.println("Second Array " + P2);*/
        if (P1 == nums1.length){

            for (int i = P2; i < nums2.length; i++) {
                System.out.print(" "+ nums2[i]);
                ans[index] = nums2[i];
                index++;
            }
        }

        if (P2 == nums2.length){

            for (int i = P1; i < nums1.length; i++) {
                System.out.print(" "+ nums1[i]);
                ans[index] = nums1[i];
                index++;
            }
        }


        System.out.println();
        for (int i = 0; i < ans.length; i++) {
            System.out.print(" "+ans[i]);
        }

        System.out.println("Length = " +index);
        double f_median = 0;
        double s_median = 0;

        if (index%2==0){

             f_median = ans[index/2 -1];
             s_median = ans[index/2];
            System.out.println("Median  = "+f_median + ", "+ s_median);
            median = ((f_median+s_median)/2.0);

        }else {
            f_median = ans[index/2];
            median = f_median;

        }




        return median;

    }
}
