package com.startjava.lesson_1.finalLesson;

public class Calculator {
    public static void main(String[] args) {
        char sign = '-';
        int num1 = 10;
        int num2 = 2;
        int result = 0;
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            result = 1;
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
        } else if (sign == '%') {
            result = num1 % 2;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}