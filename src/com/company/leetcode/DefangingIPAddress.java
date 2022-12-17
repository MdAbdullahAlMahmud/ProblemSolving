package com.company.leetcode;

public class DefangingIPAddress {


    public static void main(String[] args) {

        String address = "1.1.1.1";
        System.out.println("Output " + defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {

        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {

            if (address.charAt(i) == '.'){
                modifiedString.append("[.]");
            }else {
                modifiedString.append(address.charAt(i));
            }
        }


        return  modifiedString.toString();

    }
}
