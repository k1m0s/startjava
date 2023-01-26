package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int num1;
    private static int num2;
    private static int sign;

    public static void partsExpression(String expression) {
        String[] partsExpression = expression.split(" ");
            num1 = positiveIntegerNumber(partsExpression[0]);
            sign = partsExpression[1].charAt(0);
            num2 = positiveIntegerNumber(partsExpression[2]);
        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int positiveIntegerNumber(String s) {
        int num;
        try {
            num = Integer.parseInt(s);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException();
        }
        return num;
    }

    public static int calculate(String expression) {
        partsExpression(expression);
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            default -> 0;
        };
    }
}