package com.company.leetcode;

public class MergeSortedArray {


    public static void main(String[] args) {
        int num1[] = {1,2,3,0,0,0};
        int num2[] = {2,5,6};
        merge(num1,num1.length,num2,num2.length);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int ans[] = new int[m];
        int index = 0 ;

        int P1 = 0 ;
        int P2 = 0 ;
        while (P1< m-n && P2 < n){

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
        if (P1 == m-n){

            for (int i = P2; i < nums2.length; i++) {
               System.out.print(" "+ nums2[i]);
                ans[index] = nums2[i];
                index++;
            }
        }

        if (P2 == n){

            for (int i = P1; i < m-n; i++) {
               // System.out.print(" "+ nums1[i]);
                ans[index] = nums1[i];
                index++;
            }
        }
        System.out.println("Output of num1 array ");
        for (int i = 0; i < ans.length; i++) {
            nums1[i] = ans[i];
        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(" "+ nums1[i]);
        }

    }
}
