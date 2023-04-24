//static 사용 유무

package com.example.test2.week1.day5;
//public class SpaceInvader {
//  int location = 0;
//
//  private void moveLeft() {
//    location -= 1;
//    System.out.printf("moveLeft: %d\n", location);
//  }
//  private void moveRight() {
//    location += 1;
//    System.out.printf("moveRight: %d\n", location);
//  }
//
//  public static void main(String[] args) {
//    SpaceInvader si = new SpaceInvader();
//    si.moveLeft();
//    si.moveRight();
//    si.moveRight();
//    si.moveRight();
//  }
//}

public class SpaceInvader {

  private static void moveLeft() {
    int location = 0;

    location -= 1;
    System.out.printf("moveLeft: %d\n", location);
  }
  private static void moveRight() {
    int location = 0;

    location += 1;
    System.out.printf("moveRight: %d\n", location);
  }

}


