package com.company.codeforce_contest;

import java.util.Scanner;

public class Contest {

    public static void main(String[] args) {

        int count = 0;

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if (b>a){
                count++;
            }
            if (c>a){
                count++;
            }
            if (d>a){
                count++;
            }
            System.out.println(count);
            count = 0;
        }






    }
}
