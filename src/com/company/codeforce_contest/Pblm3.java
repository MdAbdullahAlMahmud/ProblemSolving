package com.company.codeforce_contest;

import java.util.Scanner;

public class Pblm3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       // int t  = scanner.nextInt();

        char board [][] = new char[8][8];
        //int  board [][] = new int[8][8];
        for (int i = 0; i < 8; i++) {
                board[i] = scanner.next().toCharArray();

        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }
}
