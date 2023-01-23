package src.com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                Calculator calc = new Calculator();
                System.out.print("Enter a mathematical expression by a space: ");
                calc.inputExpression(scan.nextLine());
                System.out.println("Result = " + calc.calculate());
            }
            System.out.print("Do you want to continue expression? [yes/no]: ");
            answer = scan.nextLine();
        } while (!"no".equals(answer));
    }
}