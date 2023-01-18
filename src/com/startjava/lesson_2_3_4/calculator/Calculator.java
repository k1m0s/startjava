package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;
    private String expression;

    public void setExpression(String expression) {
        String[] exprArray;
        exprArray = expression.split(" ");
        num1 = Integer.parseInt(exprArray[0]);
        sign = exprArray[1].charAt(0);
        num2 = Integer.parseInt(exprArray[2]);
    }
    public double calculate() {
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            case '^' -> (double) Math.pow(num1, num2);
            default -> 0;
        };
    }
}