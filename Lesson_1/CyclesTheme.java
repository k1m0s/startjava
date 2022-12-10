public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1-Подсчет суммы четных и нечетных чисел.");
        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("Сумма четных = " + sumEven);
        System.out.println("Сумма не четных = " + sumOdd);

        System.out.println("\n2-Вывод чисел в интервале между (max и min).");
        int a = -1;
        int b = 5;
        int c = 10;
        int min = 0;
        int max = 0;
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else if (c < a && c < b) {
            min = c;
        }
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else if (c > a && c > b) {
            max = c;
        }
        for (int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("\n3-Вывод реверсивного числа и суммы его цифр.");
        int srcNum  = 1234;
        int sumDigits = 0;
        while (srcNum != 0) {
            int digit = srcNum % 10;
            sumDigits += digit;
            srcNum /= 10;
            System.out.print(digit);
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4-Вывод чисел на консоль в несколько строк.");
        for (int i = 1; i < 24; i +=2 ) {
            for (int j = 0; j < 5; j++) {
                if (i < 24) {
                    System.out.printf("%4d", i);
                } else {
                    System.out.printf("%4d", 0);
                }
                i += 2;
            }
            i -= 2;
            System.out.println();
        }

        System.out.println("\n5-Проверка количества двоек на четность/нечетность.");
        srcNum = 3242592;
        int copySrcNum = srcNum;
        int equals = 0;
        int digit = 0;
        while (copySrcNum > 0) {
            if (digit == 2) {
                equals++;
            }
            digit = copySrcNum % 10;
            copySrcNum /= 10;
        }
        if (equals % 2 == 0) {
            System.out.println("Число " + srcNum + ", содержит " + equals + " четное количество 2");
        } else {
            System.out.println("Число " + srcNum + ", содержит " + equals + " нечетное количество 2");
        }

        System.out.println("\n6-Отображение фигур в консоли.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int numSymbolsPerLine = 5;
        while (numSymbolsPerLine >= 1) {
            int numLines = 1;
            while (numLines <= numSymbolsPerLine) {
                System.out.print("#");
                numLines++;
            }
            System.out.println();
            numSymbolsPerLine--;
        }
        System.out.println();

        int numLines;
        numSymbolsPerLine = 5;
        do {
            if (numSymbolsPerLine < 3) {
                numLines = numSymbolsPerLine;
            } else {
                numLines = 6 - numSymbolsPerLine;
            }
            do {
                System.out.print("$");
            } while (--numLines > 0);
            System.out.println();
            numSymbolsPerLine--;
        } while (numSymbolsPerLine > 0);

        System.out.println("\n7-Отображение ASCII-символов.");
        System.out.println("DEC" + " CHAR");
        for (int i = 0; i <= 127; i++) {
            if(i < '0' && (i % 2) != 0) {
                System.out.printf("%3d %4c %n", i, i);
            }
            if (i > 'a' &&  i < 'z' && (i % 2) == 0) {
                System.out.printf("%3d %4c %n", i, i);
            }
        }

        System.out.println("\n8-Проверка, является ли число палиндромом.");
        int palindrome = 1234321;
        int reverse = 0;
        int palindromeCopy = palindrome;
        while (palindrome > 0) {
            digit = palindrome % 10;
            reverse = reverse * 10 + digit;
            palindrome /= 10;
        }
        if (palindromeCopy == reverse) {
            System.out.println("Число 1234321 является палиндромом.");
        } else {
            System.out.println("Число 1234321 не является палиндромом.");
        }

        System.out.println("\n9-Определение, является ли число счастливым.");
        int luckyNum = 123123;
        int right = luckyNum % 1000;
        int left = luckyNum / 1000;
        int sumRight = 0;
        int sumLeft = 0;
        for (int i = 3; i > 0; i--) {
            sumRight += right % 10;
            right /= 10;
            sumLeft += left % 10;
            left /= 10;
        }
        System.out.println("Сумма первых трех = " + sumRight);
        System.out.println("Сумма последних трех = " + sumLeft);
        if (sumRight == sumLeft) {
            System.out.println("Число счастливое ");
        } else {
            System.out.println("Число не счастливое ");
        }

        System.out.println("\n10-Вывод таблицы умножения Пифагора.");
        System.out.print("_|");
        for (int i = 2; i < 10; i++){
            System.out.printf("%3s", "__" + i);
        }
        System.out.println();
        for (int j = 2; j < 10; j++){
            System.out.printf("%1s", j + "|");
            for (int k = 2; k < 10; k++) {
                System.out.printf("%3s", j * k);
            }
            System.out.println();
        }
    }
}