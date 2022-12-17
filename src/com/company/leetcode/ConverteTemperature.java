package com.company.leetcode;

public class ConverteTemperature {

    public static void main(String[] args) {

        double temp =  36.50;
        double ans[] = convertTemperature(temp);
        System.out.println("["+ans[0]+","+ans[1] +" ]");

    }
    public static double[] convertTemperature(double celsius) {

        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;

        double ans[] = new double[2];
        ans[0] = Kelvin;
        ans[1] = Fahrenheit;
        return  ans;


    }
}
