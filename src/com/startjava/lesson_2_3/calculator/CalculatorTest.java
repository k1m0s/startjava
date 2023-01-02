package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                Calculator calc = new Calculator();
                System.out.print("Введите первое число: ");
                calc.setNum1(scan.nextInt());
                System.out.print("Введите знак математической операции: ");
                calc.setSign(scan.next().charAt(0));
                System.out.print("Введите второе число: ");
                calc.setNum2(scan.nextInt());
                System.out.println("Ответ: " + calc.calculate());
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            scan.nextLine();
            answer = scan.nextLine();
        } while (!"no".equals(answer));
    }
}