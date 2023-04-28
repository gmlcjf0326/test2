package com.example.test2.week02.Day5;

import java.util.Scanner;

public class HolZzak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum1 = sc.nextInt();
        if(inputNum1 % 2 == 0){
            System.out.println("짝수입니다");
        }else {
            System.out.println("빼박 홀수");
        }
    }
    
}
