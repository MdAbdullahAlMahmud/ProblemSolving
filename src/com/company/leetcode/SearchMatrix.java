package com.company.leetcode;

public class SearchMatrix {

    public static void main(String[] args) {

        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};


        System.out.println("Ans  " + searchMatrix(arr,3) );

    }



    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n ;

        for (int i = 0; i < m; i++) {
             n = matrix[i].length;
            for (int j = 0; j < n; j++) {
                int val = matrix[i][j];
                if (target == val) return  true;
                //System.out.print(matrix[i][j] + " ");
            }
            //System.out.println();

        }

        return  false;
    }
}
