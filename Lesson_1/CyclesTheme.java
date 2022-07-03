public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1-Подсчет суммы четных и нечетных чисел.");
        int sumEven = 0;
        int sumOddn = 0;
        int srcNumber = -10;
        do {
            if (srcNumber % 2 == 0) {
                sumEven = sumEven + srcNumber;
            } else {
                sumOddn = sumOddn + srcNumber;
            }
            srcNumber++;
        } while (srcNumber <= 21);
        System.out.println("Сумма четных = " + sumEven);
        System.out.println("Сумма не четных = " + sumOddn);

        System.out.println("\n2-Вывод чисел в интервале между (max и min)");
        int a = 10;
        int b = 5;
        int c = -1;
        for (int i = 0; i < a ||  i <= b || i < c; i++) {
            System.out.println(i);
        }

        System.out.println("\n3-Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sumReversible = 0;
        int reversible = 0;
        while (number != 0) {
            sumReversible += (number % 10);
            int digit = number % 10;
            reversible = reversible * 10 + digit;
            number /= 10;
        }
        System.out.println(reversible + "\n" + sumReversible);
    }
}