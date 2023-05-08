package com.example.test2.week4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", inputNum, i, inputNum * i);
        }
    }
}

//    1256번
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int inputNum = sc.nextInt();
//        for (int i = 0; i < inputNum; i++) {
//            System.out.print("*");
//        }
//    }
