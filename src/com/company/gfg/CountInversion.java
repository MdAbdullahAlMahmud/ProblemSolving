package com.company.gfg;

public class CountInversion {
    static long count = 0;
    public static void main(String[] args) {
        long N = 5;
        long  arr[] = {2, 4, 1, 3, 5};
        inversionCount(arr,N);

    }
    static long inversionCount(long arr[], long N)
    {


        /*

        // Time Complexity O(N^2)



        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {

                if (arr[i] > arr[j] ){
                    count++;
                }
            }
        }
*/
        count = 0;
        sort(arr,0,(int)N-1);
        //System.out.println("Count " + count);
        return  count;
    }
    public static void   sort(long  arr[], int  l, int  r)
    {
        /***
         * Time Complexity O(nlogn)
         */
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m,r);
        }
    }

    public static void merge(long arr[], int  l, int  m, int  r)
    {
        // Find sizes of two subarrays to be merged
        int  n1 = m - l + 1;
        int   n2 = r - m;

        /* Create temp arrays */
        long  L[] = new long [n1];
        long  R[] = new long[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
                count += n1 - i;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
