package com.company.leetcode;

import java.util.HashMap;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int nums[] = {-1,1,0,-3,3};
       // int ans[] = productExceptSelf(nums);
        int ans[] = finalVersion(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        for (int i = 0; i < nums.length; i++) {

                totalProduct*=nums[i];

        }
        System.out.println("Total Product "+ totalProduct);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[i] = totalProduct/nums[i];
            }else {
                nums[i] =totalProduct;
            }
        }



        System.out.println("Total Product "+ totalProduct);


        return nums;


    }
    public static int[] productExceptSelfV1(int[] nums) {
        int totalProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                totalProduct*=nums[i];
            }
        }




        System.out.println("Total Product "+ totalProduct);


        return nums;


    }
    public static int[] bruteforceApproach(int nums[]){
        int[] copyAddress = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copyAddress[i] = exceptSelfProduct(i,nums);
        }
        return copyAddress;

    }
    private static int exceptSelfProduct(int i,int[] nums) {

        int totalProductExceptSelf = 1;
        for (int j = 0; j < nums.length; j++) {
            if (i!=j){
                totalProductExceptSelf*=nums[j];
            }
        }
        return totalProductExceptSelf;
    }

    public static int[] hashApproach(int nums[]){
        HashMap<Integer,Integer>map= new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            map.put(j, nums[j] * map.getOrDefault(j-1,1));
        }

        int[] copyProduct = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int t = i+1;
            int rightProduct = 1;
            while (t<nums.length){
                rightProduct*=nums[t];
                t++;
            }
            int leftProduct = map.getOrDefault(i-1,1);
            copyProduct[i] = leftProduct*rightProduct;
          //  System.out.println(nums[i] + " Right Product " + rightProduct);
          //  System.out.println(nums[i] + " Left  Product " + map.getOrDefault(i-1,1));

        }

        return copyProduct;
    }

    public static int[] finalVersion(int nums[]){
        int s[] = new int[nums.length];
        int p[] = new int[nums.length];


        s[0] = 1 ;
        for (int i = 1; i < nums.length; i++) {
            s[i] = s[i-1] * nums[i-1];
        }

        p[nums.length-1] = 1;
        for (int j=nums.length-2; j >= 0 ;j--){
            p[j] = nums[j+1] * p[j+1];
        }
        for (int i = 0 ; i< nums.length;i++){
            nums[i] = s[i] * p[i];
        }

        return  nums;
    }
}
