package com.startjava.lesson_1.finalLesson;

public class MyFirstGame {
    public static void main(String[] args) {
        int guessNum = 85;
        int searchNum = 0;
        int left = 0;
        int right = 100;
        while (left <= right) {
            searchNum = (left + right) / 2;
            if (searchNum < guessNum) {
                left = searchNum + 1;
                System.out.println("Число " + searchNum + " больше того, что загадал компьютер");
            } else if (searchNum > guessNum) {
                right = searchNum - 1;
                System.out.println("Число " + searchNum + " меньше того, что загадал компьютер");
            }
            if (searchNum == guessNum) {
                break;
            }
        }
        System.out.println("Вы победили! Число компьютера: " + searchNum);
    }
}