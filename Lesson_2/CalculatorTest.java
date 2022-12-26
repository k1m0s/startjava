import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        do {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        calc.setNum1(scan.nextInt());
        System.out.print("Введите знак математической операции: ");
        calc.setSign(scan.next().charAt(0));
        System.out.print("Введите второе число: ");
        calc.setNum2(scan.nextInt());
        calc.result();
        answer = scan.nextLine();

        while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                System.out.println("Вы хотите продолжить? [y/n]");
                answer = scan.nextLine();
            }
        } while (answer.equalsIgnoreCase("y"));
    }
}