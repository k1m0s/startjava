public class ifElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1-Перевод псевдокода на язык Java.");
        int age = 21;
        if(age > 20) {
            System.out.println("Если ваш возраст больше 20");
        } else {
            System.out.println("Вам еще рано");
        }
        boolean male = false;
        if(!male) {
            System.out.println("И вы женского пола");
        }
        double height = 1.75;
        if(height < 1.80) {
            System.out.println("С ростом ниже 1.80");
        } else {
            System.out.println("Вы нам не подходите");
        }
        int firstLetterName = "Mishel".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("И ваше имя начинается на М просив вас связаться с нами +7******");
        } else if(firstLetterName == 'I') {
            System.out.println("И ваше имя начинается на И просив вас связаться с нами +7******");
        } else {
            System.out.println("Вы нам не подходите");
        }

        System.out.println("\n" + "2-Поиск max и min числа.");
        int minNumber = 1;
        int maxNumber = 10;
        if (minNumber < maxNumber) {
            System.out.println("Минимальное значение - " + minNumber);
            System.out.println("Максимальное значение - " + maxNumber);
        } else {
            System.out.println("Минимальное значение - " + maxNumber);
            System.out.println("Максимальное значение - " + minNumber);
        }

        System.out.println("\n" + "3-Работа с числом.");
        int srcNum = 3;
        if (srcNum != 0) {
            System.out.println("Число " + srcNum);
            if (srcNum % 2 == 0) {
            System.out.println("Четное");
            } else {
            System.out.println("Не четное");
            }
            if (srcNum < 0) {
            System.out.println("Отрицательное");
            } else {
            System.out.println("Положительное");
            }
        } else {
        System.out.println("Число - " + srcNum);
        }

        System.out.println("\n" + "4-Поиск одинаковых цифр в числах.");
        int number1 = 123;
        int number2 = 324;
        int firstHundredDigit = number1 / 100;
        int secondHundredDigit = number2 / 100;
        int firstDecimalDigit = number1 % 100 / 10;
        int secondDecimalDigit = number2 % 100 / 10;
        int firstOnesDigit = number1 % 10;
        int secondOnesDigigt = number2 % 10;
        if (firstHundredDigit == secondHundredDigit) {
            System.out.println("В числах " + number1 + " и " + number2 +
             " одинаковые цифры " + firstHundredDigit + " в сотом разряде");
        } else if (firstDecimalDigit == secondDecimalDigit) {
            System.out.println("В числах " + number1 + " и " + number2 +
             " одинаковые цифры " + firstDecimalDigit + " в сотом разряде");
        } else if (firstOnesDigit == secondOnesDigigt) {
            System.out.println("В числах " + number1 + " и " + number2 +
             " одинаковые цифры " + firstOnesDigit + " в сотом разряде");
        }

        System.out.println("\n" + "5-Определение буквы, числа или символа по их коду.");
        char unknownCode = '\u0057';
        if (unknownCode >= 97 && unknownCode <= 122) {
            System.out.println("Маленькая буква");
        } else if (unknownCode >= 65 && unknownCode <= 90) {
            System.out.println("Большая буква");
        } else if (unknownCode >= 48 && unknownCode <= 57) {
            System.out.println("Число");
        } else {
            System.out.println("Не буква и не число");
        }

        System.out.println("\n" + "6-Определение суммы вклада и начисленных банком %.");
        int deposit = 300000;
        int percent;
        if (deposit < 100000) {
            percent = deposit * 5 / 100;
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = deposit * 7 / 100;
        } else {
            percent = deposit * 10 / 100;
        }
        System.out.println("Сумма вклада - " + deposit);
        System.out.println("Начисленный % - " + percent);
        System.out.println("Итоговую сумму с % - " + (deposit + percent));

        System.out.println("\n" + "7-Определение оценки по предметам.");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 0;
        int programmingGrade = 0;
        if (historyPercent <= 60) {
             historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
             historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
             historyGrade = 4;
        } else if (historyPercent > 91) {
             historyGrade = 5;
        }

        if (programmingPercent <= 60) {
             programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
             programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
             programmingGrade = 4;
        } else if (programmingPercent > 91) {
             programmingGrade = 5;
        }
        System.out.println("Оценка по истории - " + historyGrade);
        System.out.println("Оценка по программированию - " + programmingGrade);
        System.out.println("Средний балл по предметам - " + (historyGrade + programmingGrade) / 2);
        System.out.println("Средний % по предметам - " + (historyPercent + programmingPercent) / 2 + "%");

        System.out.println("\n" + "8-Расчет прибыли.");
        int rent = 5000;
        int sales = 13000;
        int costPrice = 9000;
        int profit = (sales - costPrice - rent) * 12;
        if (profit <= 0) {
            System.out.println("Прибыль за год: " + profit + " руб.");
        } else if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit + " руб.");
        }

        System.out.println("\n" + "9-Подсчет количества банкнот.");
        int bankomat = 567;
        int one = 17;
        int ten = 5;
        int hundred = 5;
        int sum = (hundred * 100) + (ten * 10) + one;
        if (one >= 7 && ten >=6 && hundred >= 5) {
            System.out.println("Сто$ " + "Десять$ " + "Один$ ");
            System.out.println(hundred + " по сто " + ten + " по десять " + one + " по одному");
            System.out.println(sum);
        } else {
            System.out.println("Сто$ " + "Десять$ " + "Один$ ");
            System.out.println(hundred + " по сто " + ten + " по десять " + one + " по одному");
            System.out.println(sum);
        }
    }
}