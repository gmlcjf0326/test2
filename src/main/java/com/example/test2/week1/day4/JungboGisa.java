package com.example.test2.week1.day4;

import java.util.Scanner;

public class JungboGisa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int student = sc.nextInt();
    
    if(student > 60){
      System.out.println("합격!");
    }else {
      System.out.println("불합격");
    }
  }
}
