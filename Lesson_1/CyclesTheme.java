public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1-Подсчет суммы четных и нечетных чисел.");
        int sumEven = 0;
        int sumOddn = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOddn += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("Сумма четных = " + sumEven);
        System.out.println("Сумма не четных = " + sumOddn);

        System.out.println("\n2-Вывод чисел в интервале между (max и min).");
        int max = 10;
        int middle = 5;
        int min = -1;
        if (max > middle && max > min) {
            for (int i = 0; i < max; i++) {
            System.out.println(i);
            }
        } else if(middle > max && middle > min) {
            for (int i = 0; i < middle; i++) {
            System.out.println(i);
            }
        } else if (min > max && min > middle) {
            for (int i = 0; i < min; i++) {
            System.out.println(i);
            }
        }

        System.out.println("\n3-Вывод реверсивного числа и суммы его цифр.");
        int srcNum = 1234;
        int sumDigits = 0;
        int reverseNum = 0;
        while (srcNum != 0) {
            sumDigits += (srcNum % 10);
            int digit = srcNum % 10;
            reverseNum = reverseNum * 10 + digit;
            srcNum /= 10;
        }
        System.out.println(reverseNum + "\n" + sumDigits);

        System.out.println("\n4-Вывод чисел на консоль в несколько строк.");
        for (int i = 1; i < 24; i+=2) {
            for (int k = 0; k < 5; k++) {
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

        System.out.println("\n5-Проверка количества единиц на четность.");
        int inputNum = 3242592;
        int inputFinal = inputNum;
        int even = 0;
        int odd = 0;
        while (inputFinal > 0) {
            if(inputFinal % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            inputFinal = inputFinal / 10;
        }
        System.out.println("Число: " + inputNum + " содержит.");
        System.out.println("Четное: " + even + ", Не четное: " + odd);

        System.out.println("\n6-Отображение фигур в консоли.");
        for (int i = 1; i <=5; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();

        int sharp = 5;
        while (sharp >= 1) {
            int j = 1;
            while (j <= sharp) {
                System.out.print("#");
                j++;
            }
            System.out.println("");
            sharp--;
        }
        System.out.println();

        int dollar = 0;
        do {
        if (dollar == 0) {
            System.out.println("$");
        } else if (dollar > 0 && dollar < 3) {
            System.out.print("$");
        } else if (dollar == 3) {
            System.out.print("\n" + "$");
        } else if (dollar > 3 && dollar < 6) {
            System.out.print("$");
        } else if (dollar == 6) {
            System.out.print("\n" + "$");
        } else if (dollar > 6 && dollar < 8) {
            System.out.print("$");
        } else {
            System.out.println("\n" + "$");
        }
        dollar++;
    } while (dollar <= 8);

    System.out.println("\n7-Отображение ASCII-символов.");
    System.out.println("DEC" + " CHAR");
    for (int i = 0; i <= 127; i++) {
        if((char) i < '0' && (i % 2) != 0) {
            System.out.printf("%3s %4s %n", i, (char) i);
        }
        if ((char) i > 'a' && (char) i < 'z' && (i % 2) == 0) {
            System.out.printf("%3s %4s %n", i, (char) i);
        }
    }

    System.out.println("\n8-Проверка, является ли число палиндромом.");
    int numInput = 1234321;
    int reverse = 0;
    int polidrom = numInput;
    while (numInput != 0) {
        int remainder = numInput % 10;
        reverse = reverse * 10 + remainder;
        numInput = numInput / 10;
    }
    if (polidrom == reverse) {
        System.out.println("Число 1234321 является палиндромом.");
    } else {
        System.out.println("Число 1234321 не является палиндромом.");
    }

    System.out.println("\n9-Определение, является ли число счастливым.");
    int num = 123123;
    int right = num % 1000;
    int left = num / 1000;
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
    System.out.println("");
    for (int j = 2; j < 10; j++){
        System.out.printf("%1s", j + "|");
        for (int k = 2; k < 10; k++) {
            System.out.printf("%3s", j * k);
        }
        System.out.println("");
    }

    }
}