package com.company;

public class SumOfTwoStringNumber {
    public static void main(String[] args) {

        String ans = addTwoStringNumbers("1000000000000000000000000000001","465");
        System.out.println(ans);

    }



    public static String addTwoStringNumbers(final String n1, final String n2) {
        StringBuilder sb = new StringBuilder();
        int carry =0;
        byte[] nb1; byte[] nb2;
        if (n1.length() > n2.length()){
            nb1 = n1.getBytes();
            nb2 = n2.getBytes();
        } else {
            nb2 = n1.getBytes();
            nb1 = n2.getBytes();
        }

        int maxLen=n1.length()>=n2.length()?n1.length():n2.length();
        for (int i = 1; i <= maxLen ; i++) {
            int a = nb1.length-i >= 0 ? nb1[nb1.length-i] - 48 : 0;
            int b = nb2.length-i >= 0 ? nb2[nb2.length-i] - 48 : 0;
            int result = a + b + carry;

            if (result >= 10){
                carry = 1;
                result = result-10;
            } else {
                carry = 0;
            }
            sb.insert(0, result);
        }
        if(carry>0){
            sb.insert(0, carry);
        }
        return sb.toString();
    }
}
