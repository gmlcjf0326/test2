package com.example.test2.Code100;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
//    1103번 문제
//    System.out.printf("\"c:\\test\"");
//    1106번 문제
//    int minNum = Integer.MIN_VALUE;
//    int maxNum = Integer.MAX_VALUE;
//    System.out.printf("%d %d", minNum, maxNum);
//  }
//}
//  1071번 문제
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    for (int i = n; n != 0;) {
//      System.out.println(n);
//      n = sc.nextInt();
//    }
//  }
//  }
//  1072번 문제
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m;
    for (int i = 1; i <= n; i++) {
      m = sc.nextInt();
      System.out.println(m);
    }
  }
}

//// 1122번 문제
//    Scanner sc = new Scanner(System.in);
//    int input1 = sc.nextInt();
//    System.out.printf("%d %d\n", input1/60, input1 % 60);
//
//  }
//}
//// 1123번 문제
//    Scanner sc = new Scanner(System.in);
//    float input1 = sc.nextFloat();
//    System.out.printf("%.3f\n", ((9/5 * input1 + 32)));
//
//  }
//}
//    71번문제
//    72번문제
//    73번문제
//    74번문제
//    75번문제
//    76번문제
//    77번문제
//    78번문제
//    79번문제
//    80번문제
//    81번문제
//    82번문제
//    83번문제
//    84번문제
//    85번문제
//    86번문제
//    87번문제
//    88번문제
//    89번문제
//
// public class Main {
//  public static void main(String[] args) {
//    abcd(1,2,3);
//  }
//
//  public void abcd(int a, int d, int n){   // static이 없으면 인스턴스 메써드,
//    int result = a + (n-1) * d;
//    System.out.println(result);
//  }
//}

//    90번문제
//    91번문제
//    92번문제
//    93번문제
//    94번문제
//    95번문제
//    96번문제
//    97번문제
//    98번문제
//    99번문제
//    100번문제




//    1번문제 출력하기01(설명)
//    System.out.println("Hello");
//    2번문제 출력하기02(설명)
//    System.out.println("Hello World");
//    3번문제 출력하기03(설명)
//    System.out.println("Hello\nWorld");
//    4번문제 출력하기04(설명)
//    System.out.println("'Hello'");
//    5번문제 출력하기05(설명)
//    System.out.println("\"Hello World\"");
//    6번문제 출력하기06(설명)
//    System.out.println("\"!@#$%^&*()\"");
//    7번문제 출력하기07(설명)
//    System.out.println("\"C:\\Download\\hello.cpp\"");
//    8번문제 출력하기08(설명)
//    System.out.printf("\u250c");
//    System.out.printf("\u252c");
//    System.out.println("\u2510");
//    System.out.printf("\u251c");
//    System.out.printf("\u253c");
//    System.out.println("\u2524");
//    System.out.printf("\u2514");
//    System.out.printf("\u2534");
//    System.out.printf("\u2518");

//    10번문제 정수 1개 입력받아 그대로 출력하기(설명)
//    Scanner sc = new Scanner(System.in);
//    System.out.printf("%d", sc.nextInt());

//    11번문제 문자 1개 입력받아 그대로 출력하기(설명)
//    Scanner sc = new Scanner(System.in);
//    System.out.printf("%c", sc.next().charAt(0));

//    12번문제 실수 1개 입력받아 그대로 출력하기(설명)
//    Scanner sc = new Scanner(System.in);
//    System.out.printf("%f", sc.nextFloat());

//    13번문제 정수 2개 입력받아 그대로 출력하기(설명)
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.printf("%d %d", a, b);

//    14번문제 문자 2개 입력받아 순서 바꿔 출력하기(설명)
//    Scanner sc = new Scanner(System.in);
//    int val1 = sc.next().charAt(0);
//    int val2 = sc.next().charAt(0);
//    System.out.printf("%c %c", val2, val1);

//    15번문제 실수 입력받아 둘째 자리까지 출력하기(설명)
//    Scanner sc = new Scanner(System.in);
//    float val1 = sc.nextFloat();
//    System.out.printf("%.3f", val1);//

//    17번문제 정수 1개 입력받아 3번 출력하기(설명)
//    Scanner sc = new Scanner(System.in);
//    int val1 = sc.nextInt();
//    System.out.printf("%d %d %d", val1, val1, val1);

//  18번 문제
//    Scanner sc = new Scanner(System.in);
//    String[] strArr = sc.nextLine().split(":");
//    int hour = Integer.parseInt(strArr[0]);
//    int minute = Integer.parseInt(strArr[1]);
//    System.out.printf("%d:%d", hour, minute);
//  19번 문제
//    Scanner sc = new Scanner(System.in);
//    String[] strArr = sc.nextLine().split("\\.");
//    int year = Integer.parseInt(strArr[0]);
//    int month = Integer.parseInt(strArr[1]);
//    int day = Integer.parseInt(strArr[2]);
//    System.out.printf("%04d.%02d.%02d", year, month, day);
//  }
//}
//  20번 문제
//Scanner sc = new Scanner(System.in);
//  String a = sc.next();
//  String[] arr = a.split("\\-");
//    System.out.printf("%s%s", arr[0], arr[1]);

//    21, 22번문제 단어, 문장 1개 입력받아 그대로 출력하기(설명)
//    Scanner sc = new Scanner(System.in);
//        String data2 = sc.nextLine();
//        System.out.printf("%s", data2);
//        }
//    23번문제 ~ 30번문제 x

//23번
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String[] a = sc.nextLine().split("\\.");
//    int b = Integer.parseInt(a[0]);
//    int c = Integer.parseInt(a[1]);
//    System.out.printf("%d\n%d", b, c);
//  }
//}
// 26번
//public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  String[] inputStr = sc.nextLine().split("\\:");
//  int outPut1 = Integer.parseInt(inputStr[0]);
//  int outPut2 = Integer.parseInt(inputStr[1]);
//  int outPut3 = Integer.parseInt(inputStr[2]);
//  System.out.printf("%d", outPut2);
//}
//}
// 27번
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String[] inputStr = sc.nextLine().split("\\.");
//    int outPut1 = Integer.parseInt(inputStr[0]);
//    int outPut2 = Integer.parseInt(inputStr[1]);
//    int outPut3 = Integer.parseInt(inputStr[2]);
//    System.out.printf("%02d-%02d-%04d", outPut3, outPut2, outPut1);
//  }
//}


//    31번문제 10진 정수 1개 입력받아 8진수로 출력하기(설명)
//  Scanner sc = new Scanner(System.in);
//      int a = sc.nextInt();
//      System.out.printf("%o", a);

//    32번문제 10진 정수 입력받아 16진수로 출력하기1(설명)
//  Scanner sc = new Scanner(System.in);
//      int a = sc.nextInt();
//      System.out.printf("%x", a);

//    33번문제 10진 정수 입력받아 16진수로 출력하기2(설명)
//  Scanner sc = new Scanner(System.in);
//      int a = sc.nextInt();
//      System.out.printf("%X", a);

//    34번문제 8진 정수 1개 입력받아 10진수로 출력하기(설명)
//    Scanner sc = new Scanner(System.in);
//        String octal = sc.next();
//        int decimal = Integer.parseInt(octal, 8);
//        System.out.println(decimal);

//    35번문제 16진 정수 1개 입력받아 8진수로 출력하기(설명)
//    Scanner sc = new Scanner(System.in);
//        String octal = sc.next();
//        int decimal = Integer.parseInt(octal, 16);
//        System.out.printf("%o", decimal);

//    36번문제 [기초-출력변환] 영문자 1개 입력받아 10진수로 출력하기(설명)
//    Scanner sc = new Scanner(System.in);
//        char octal = sc.next().charAt(0);
//        int asci = (int) octal;
//        System.out.printf("%d", asci);

//    37번문제 [기초-출력변환] 정수 입력받아 아스키 문자로 출력하기
//    Scanner sc = new Scanner(System.in);
//        int desimal = sc.nextInt();
//        char asci = (char) desimal;
//        System.out.printf("%c", asci);
//    38번문제 정수 2개 입력받아 합 출력하기1(설명)
//    Scanner sc = new Scanner(System.in);
//        long first = sc.nextLong();
//        long second = sc.nextLong();
//        System.out.println(first + second);

//    39번문제
//Scanner sc = new Scanner(System.in);
//long first = sc.nextLong();
//  long second = sc.nextLong();
//  System.out.println(first + second);

// 39번
//    Scanner sc = new Scanner(System.in);
//    String[] arrStr = sc.nextLine().split(" ");
//    long input1 = Long.parseLong(arrStr[0]);
//    long input2 = Long.parseLong(arrStr[1]);
//    System.out.println(input1+input2);

//40번
//    Scanner sc = new Scanner(System.in);
//    long a = sc.nextLong();
//    System.out.printf("%d", -a);

//    41번문제
//    Scanner sc = new Scanner(System.in);
//    char c = sc.next().charAt(0);
//    int asci = (int) c+1;
//    System.out.printf("%c", asci);
//    42번문제
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int outputNum = a/b;
//    System.out.printf("%d", outputNum);

//    43번문제
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int outputNum = a%b;
//    System.out.printf("%d", outputNum);

//    44번문제
//    Scanner sc = new Scanner(System.in);
//    long a = sc.nextLong();
//    System.out.printf("%d", ++a);
//    45번문제
//        Scanner sc = new Scanner(System.in);
//        int inputNum1 = sc.nextInt();
//        int inputNum2 = sc.nextInt();
//        System.out.printf("%d\n", inputNum1+inputNum2);
//        System.out.printf("%d\n", inputNum1-inputNum2);
//        System.out.printf("%d\n", inputNum1*inputNum2);
//        System.out.printf("%d\n", inputNum1/inputNum2);
//        System.out.printf("%d\n", inputNum1%inputNum2);
//        System.out.printf("%.2f\n", (float)inputNum1%inputNum2);
//    46번문제
//    Scanner sc = new Scanner(System.in);
//    String[] inputString = sc.nextLine().split(" ");
//    long inputNum1 = Long.parseLong(inputString[0]);
//    long inputNum2 = Long.parseLong(inputString[1]);
//    long inputNum3 = Long.parseLong(inputString[2]);
//    System.out.printf("%d\n", inputNum1+inputNum2+inputNum3);
//    System.out.printf("%.1f\n", (float)(inputNum1+inputNum2+inputNum3)/3);
//    47번문제
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    System.out.printf("%d\n", a<<1);
//    48번문제
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    System.out.printf("%d\n", a<<b); // a x 2의 b승 곱합
//    System.out.printf("%d\n", a>>b); // a x 1/2의 b승 곱합
//    49번문제
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    System.out.printf("%d\n", a > b ? 1 : 0);

//    50번문제
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    System.out.printf("%d\n", a == b ? 1 : 0);

//    51번문제
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    System.out.printf("%d\n", a <= b ? 1 : 0);

//    52번문제
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    System.out.printf("%d\n", a != b ? 1 : 0);

//    53번문제
//    Scanner sc = new Scanner(System.in);
//    int inputA = sc.nextInt();
//    if(inputA == 1){
//      inputA = 0;
//      System.out.println(inputA);
//    }else if(inputA == 0) {
//      inputA = 1;
//      System.out.println(inputA);
//    } else {
//      return;
//    }


//    55번문제
//      Scanner scanner = new Scanner(System.in);
//      int a = scanner.nextInt();
//      int b = scanner.nextInt();
//      System.out.println(a == 1 || b == 1 ? 1 : 0);

//    56번문제
//      Scanner scanner = new Scanner(System.in);
//      int a = scanner.nextInt();
//      int b = scanner.nextInt();
//      System.out.println(a == 1 ^ b == 1 ? 1 : 0);

//    57번문제
//  Scanner scanner = new Scanner(System.in);
//  int a = scanner.nextInt();
//  int b = scanner.nextInt();
//  if((a == 1 && b == 1)||(a == 0 && b == 0)){
//    System.out.println(1);
//    }else {
//    System.out.println(0);

//    58번문제
//    Scanner scanner = new Scanner(System.in);
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    if(a == 0 && b == 0){
//      System.out.println(1);
//    }else {
//      System.out.println(0);
//    }
//    59번문제
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println(~a);
//      }
//    }

//    60번문제
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.printf("%d", a & b);

//    61번문제
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    System.out.printf("%d", a | b);

//    62번문제
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    System.out.printf("%d", a ^ b);

//    66번문제

//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int c = sc.nextInt();
//    if (a % 2 == 0) {
//      System.out.println("even");
//    } else {
//      System.out.println("odd");
//    }
//    if (b % 2 == 0) {
//      System.out.println("even");
//    } else {
//      System.out.println("odd");
//    }
//    if (c % 2 == 0) {
//      System.out.println("even");
//    } else {
//      System.out.println("odd");
//    }
//  }
//}

//    64번문제
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int c = sc.nextInt();
//
//    int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
//    System.out.println(min);
//  }
//}
//    67번문제
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    if(a >= 0){
//      System.out.println("plus");
//      if (a % 2 == 0) {
//        System.out.println("even");
//      } else {
//        System.out.println("odd");
//      }
//    } else {
//      System.out.println("minus");
//      if (a % 2 == 0) {
//        System.out.println("even");
//      } else {
//        System.out.println("odd");
//      }
//    }
//  }
//}
//    68번문제
//    69번문제
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    char input1 = sc.nextLine().charAt(0);
//    switch (input1){
//      case 'A' :
//        System.out.println("best!!!");
//        break;
//      case 'B' :
//        System.out.println("good!!");
//        break;
//      case 'C' :
//        System.out.println("run!");
//        break;
//      case 'D' :
//        System.out.println("slowly~");
//        break;
//      default:
//        System.out.println("what?");
//        break;
//    }
//  }
//}
//    70번문제
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int input1 = sc.nextInt();
//    switch (input1){
//      case 12:
//      case 1:
//      case 2:
//        System.out.println("winter");
//        break;
//      case 3:
//      case 4:
//      case 5:
//        System.out.println("spring");
//        break;
//      case 6:
//      case 7:
//      case 8:
//        System.out.println("summer");
//        break;
//      case 9:
//      case 10:
//      case 11:
//        System.out.println("fall");
//        break;
//    }
//  }
//}

//// 1116번 문제
//    Scanner sc = new Scanner(System.in);
//    int input1 = sc.nextInt();
//    int input2 = sc.nextInt();
//    System.out.printf("%d+%d=%d\n", input1, input2,input1+input2);
//    System.out.printf("%d-%d=%d\n", input1, input2,input1-input2);
//    System.out.printf("%d*%d=%d\n", input1, input2,input1*input2);
//    System.out.printf("%d/%d=%d\n", input1, input2,input1/input2);
//  }
//}
// 1117번 문제
//    Scanner sc = new Scanner(System.in);
//    float input1 = sc.nextFloat();
//    float input2 = sc.nextFloat();
//    System.out.printf("%.2f\n", input1 * input2);
//
//  }
//}
// 1118번 문제
//  Scanner sc = new Scanner(System.in);
//  float input1 = sc.nextFloat();
//  float input2 = sc.nextFloat();
//    System.out.printf("%.1f\n", (input1 * input2)/2);
//
// }
//}
// 1119번 문제
//    Scanner sc = new Scanner(System.in);
//    float input1 = sc.nextFloat();
//    float input2 = sc.nextFloat();
//    float input3 = sc.nextFloat();
//    System.out.printf("%.2f\n", (input1 + input2 + input3)/3);
//
//  }
//}
// 1120번 문제
//        Scanner sc = new Scanner(System.in);
//        float input1 = sc.nextFloat();
//        float input2 = sc.nextFloat();
//        float input3 = sc.nextFloat();
//        System.out.printf("%.2f\n", (input1 + input2 + input3)/3);
//      }
//    }
// 1121번 문제
//    Scanner sc = new Scanner(System.in);
//    int input1 = sc.nextInt();
//    int input2 = sc.nextInt();
//    System.out.printf("%d\n", (input1 % input2));
//
//  }
//}