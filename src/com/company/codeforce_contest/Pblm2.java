package com.company.codeforce_contest;

import java.util.HashSet;
import java.util.Scanner;

public class Pblm2 {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                set.add(scanner.nextInt());
            }

            System.out.println(n%2==0?set.size():set.size()-1);
            set.clear();
        }

    }
}
