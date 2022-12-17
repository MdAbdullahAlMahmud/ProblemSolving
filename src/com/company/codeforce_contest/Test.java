package com.company.codeforce_contest;

public class Test {

    public static void main(String[] args) {

      //  System.out.println("Ans "+ recursive(7,2));
       // System.out.println("Ans2 "+ din(2));

        test();


        int arr[] = {1,2,3,4,5,8};
        System.out.println("Index " + unSortedNumber(arr));
    }
    public  static  int  recursive(int a , int b){
        if (a%b==2){
            return a;
        }else {
            return recursive(a+b,a-b);
        }
    }


    private  static  int din (int n){
        if (n==4)return  2;
        else return 2*din(n+1);
    }

    private  static void   test(){
        double sum = 0.0 , j = 1.0 , i = 2.0;

        while ((i/j) > 0.001){
            j= j+j;
            sum = sum + (i/j);
            System.out.println( "-> " + sum);
        }
    }


    private static void   printNum(){

        for (int i = 1; i <=500 ; i++) {

            if (i%7==0){

                System.out.println("Dhaka");
            }else if (i%13==0){

                System.out.println("Bangladesh");
            }else if (i%7==0 &&i%13==0 ){

                System.out.println("Dhaka, Bangladesh");
            }else {
                System.out.println(i);
            }

        }

    }

    private  static  int unSortedNumber(int arr[] ){

        for (int i = 0; i < arr.length -1 ; i++) {
            if (arr[i+1] - arr[i] != 1 ){
                return i+1;
            }
        }
        return -1;
    }



}
