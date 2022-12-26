public class Calculator {

    private int num1;
    private int num2;
    private char sign;
    private int result;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void result() {
        switch(sign) {
        case '+':
            System.out.println("Ответ: " + (num1 + num2));
            break;
        case '-':
            System.out.println("Ответ: " + (num1 - num2));
            break;
        case '*':
            System.out.println("Ответ: " + (num1 * num2));
            break;
        case '/':
            System.out.println("Ответ: " + (num1 / num2));
            break;
        case '%':
            System.out.println("Ответ: " + (num1 % num2));
            break;
        case '^':
            result = 1;
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
            System.out.println("Ответ: " + result);
            break;
        }
    }
}