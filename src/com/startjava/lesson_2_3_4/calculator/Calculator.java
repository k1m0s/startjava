package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int num1;
    private static int num2;
    private static int sign;

    public static int calculate(String expression) {
        usedPartsExpression(expression);
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

    private static void usedPartsExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        num1 = keepPositiveNumber(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        num2 = keepPositiveNumber(partsExpression[2]);
        if (num1 < 1 || num2 < 1) {
            throw new IllegalArgumentException();
        }
    }

    private static int keepPositiveNumber(String gotNum) {
        int num;
        try {
            num = Integer.parseInt(gotNum);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
        return num;
    }
}