package com.company.leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int arr[] = {1,3,4,5,6};
        //System.out.println(binarySearch(arr,5,2));
        System.out.println(searchInsert(arr,2));
    }



    public static  int binarySearch(int arr[], int n,int target){

        int low = 0;
        int high = n;

        int mid ;
        while (low<=high){
            mid = low + (high - low)/2;

            if (arr[mid] == target ){
                return  mid;

            }else if(target>arr[mid]){

                low = mid +1;

            }else {
                if (arr[mid] <=target)
                    return mid+1;
                high = mid -1;
            }

        }
        return  -1;

    }


    public  static  int searchInsert(int[] nums, int target ){
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}
