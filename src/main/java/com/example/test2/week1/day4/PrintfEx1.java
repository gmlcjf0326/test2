package com.example.test2.week1.day4;

public class PrintfEx1 {
  public void print(){
    System.out.printf("%s", "Hello");
    System.out.printf("%s", "Hello\n");
    System.out.printf("%s안녕하세요 %s희부뢀", "Hello", "우웅");
  }
  public int multiPrint(int a, int b){
    return a*b;
  }
  public static void main(String[] args) {
    PrintfEx1 printfEx = new PrintfEx1();
//    printfEx.print();
    int result = printfEx.multiPrint(2, 4);
    System.out.printf("%d * %d ="+result);
  }
}

