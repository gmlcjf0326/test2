package com.example.test2.week02.Day5;
import java.util.Scanner;
public class SungJin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int YearOfExp = sc.nextInt();
        int numOfProj = sc.nextInt();
        if( YearOfExp > 5 || numOfProj > 10){
            System.out.println("팀장승진");
        }else {
            System.out.println("진급누락임 ^ㅡ^");
        }
    }
}
