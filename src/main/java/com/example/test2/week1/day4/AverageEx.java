package com.example.test2.week1.day4;

import java.util.Scanner;

public class AverageEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("%.1f\n", sc.nextFloat());
    System.out.printf("%f\n", 0.5);
    System.out.printf("%.1f\n", 0.5123); //첫째 반올림.
    System.out.printf("%.2f\n", 0.5123);
    System.out.printf("%.3f\n", 0.5123);
  }
}
