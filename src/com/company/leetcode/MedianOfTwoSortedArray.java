package com.company.leetcode;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {

        int arr [] = {1,3};
        int arr2[] = {2,4,6};
        findMedianSortedArrays(arr,arr2);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int nums[] = new int[nums1.length + nums2.length];

        double median = 0;

        int P1 = 0 ,P2 =  0;

        int index = 0 ;
        while (index != nums.length-1){

            if (nums1[P1]  <= nums2[P2]){

                nums[index] = nums1[P1];
                index ++ ;
                 P1 ++ ;

            }else if(nums1[P1] >= nums2[P2]){
                nums[index] = nums2[P2];
                P2++;
                index++;

            }else {

                System.out.println(" Else working... ");
            }

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print( " " + nums[i] );
        }

        return  median;



    }
}
