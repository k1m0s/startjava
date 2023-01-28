package src.com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                System.out.print("Enter a mathematical expression by a space: ");
                String expression = scan.nextLine();
                try {
                    System.out.println("Result = " + Calculator.calculate(expression));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("Do you want to continue expression? [yes/no]: ");
            answer = scan.nextLine();
        } while (!"no".equals(answer));
    }
}