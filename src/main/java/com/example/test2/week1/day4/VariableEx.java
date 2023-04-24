package com.example.test2.week1.day4;

public class VariableEx {
  public static void main(String[] args) {
    int iVal;
    iVal = 0; // 최초로 값을 지정하는 것은 초기화입니다.
    VariableEx printHello; // 변수 선언
    printHello = new VariableEx(); // new를 이용해 인스턴스화 및 초기화

    System.out.println(iVal);
    printHello.print();
  }

  public void print() {
    System.out.println("Hello, world!");
  }
}
