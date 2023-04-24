package com.example.test2.week1.day5;

public class UserTestEx {
    public static void main(String[] args) {
    UserEx fuck = new UserEx();

    fuck.name = "경록";
    fuck.phoneNumber = "010-2000-0000";
    fuck.age = 37;
    fuck.isAdult();

    System.out.printf("%s은 %s가 맞습니까? = %b", fuck.name, fuck.age, fuck.isAdult());
  }
}
