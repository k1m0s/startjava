public class ifElseStatementTheme {
    public static void main(String[] args)
    {
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
        int workNumber = 3;
        boolean isEven = workNumber % 2 == 0;
        if (workNumber == 0) {
            System.out.println("Число - " + workNumber + " равно 0");
        } else if (workNumber != 0) {
            System.out.println("Число " + workNumber + " не равно 0");
        }
        if (isEven == true) {
            System.out.println("Число " + workNumber + " четное");
        } else {
            System.out.println("Число " + workNumber + " не четное");
        }
        if (workNumber < 0) {
            System.out.println("Число " + workNumber + " отрицательное");
        } else {
            System.out.println("Число " + workNumber + " положительное");
        }

        System.out.println("\n" + "4-Поиск одинаковых цифр в числах.");
        int firstNumber = 123;
        int secondNumber = 324;
        int firstHundredDigit = firstNumber / 100;
        int secondHundredDigit = secondNumber / 100;
        int firstDecimalDigit = firstNumber % 100 / 10;
        int secondDecimalDigit = secondNumber % 100 / 10;
        int firstUnitDigit = firstNumber % 10;
        int secondUnitsDigigt = secondNumber % 10;
        if (firstHundredDigit == secondHundredDigit) {
            System.out.println("В числах " + firstNumber + " и " + secondNumber +
             " одинаковые цифры " + firstHundredDigit + " в сотом разряде");
        } else if (firstDecimalDigit == secondDecimalDigit) {
            System.out.println("В числах " + firstNumber + " и " + secondNumber +
             " одинаковые цифры " + firstDecimalDigit + " в сотом разряде");
        } else if (firstUnitDigit == secondUnitsDigigt) {
            System.out.println("В числах " + firstNumber + " и " + secondNumber +
             " одинаковые цифры " + firstUnitDigit + " в сотом разряде");
        }

        System.out.println("\n" + "5-Определение буквы, числа или символа по их коду.");
        char num = '\u0057';
        if (num == '\u0057') {
            System.out.println("Большая буква " + num);
        } else if (num > '\u0057') {
            System.out.println("Это число " + num);
        } else if (num < '\u0057') {
            System.out.println("Не буква и не число " + num);
        }

        System.out.println("\n" + "6-Определение суммы вклада и начисленных банком %.");
        int deposit = 300000;
        int fivePercent = deposit * 5 / 100;
        int sevenPercent = deposit * 7 / 100;
        int tenPercent = deposit * 10 / 100;
        if (deposit < 100000) {
            System.out.println("Cумму вклада - " + deposit);
            System.out.println("Начисленный % - " + fivePercent);
            System.out.println("Итоговая сумму с % - " + (fivePercent+deposit));
        } else if (deposit >= 100000 && deposit <= 299999) {
            System.out.println("Cумму вклада - " + deposit);
            System.out.println("Начисленный % - " + sevenPercent);
            System.out.println("Итоговая сумму с % - " + (sevenPercent+deposit));
        } else {
            System.out.println("Cумма вклада - " + deposit);
            System.out.println("Начисленный % - " + tenPercent);
            System.out.println("Итоговая сумму с % - " + (tenPercent+deposit));
        }

        System.out.println("\n" + "7-Определение оценки по предметам.");
        int history = 59;
        int program = 91;
        int gradeA = 2;
        int gradeB = 3;
        int gradeC = 4;
        int gradeD = 5;
        int gpaProcent = (history + program) / 2;
        int gpaGrade = (gradeA + gradeC) / 2;
        if (history <= 60) {
            System.out.println("История - " + gradeA);
        } else if (history > 60 && program <= 73) {
            System.out.println("История - " + gradeB);
        } else if (history > 73 && program <= 91) {
            System.out.println("История - " + gradeC);
        } else if (history > 91) {
            System.out.println("История - " + gradeD);
        }
        if (program <= 60) {
            System.out.println("Программирование - " + gradeA);
        } else if (program > 60 && program <= 73) {
            System.out.println("Программирование - " + gradeB);
        } else if (program > 73 && program <= 91) {
            System.out.println("Программирование - " + gradeC);
        } else if (program > 91) {
            System.out.println("Программирование - " + gradeD);
        }
        System.out.println("Cредний балл оценок по предметам - " + gpaGrade);
        System.out.println("Cредний % по предметам - " + gpaProcent + "%");

        System.out.println("\n" + "8-Расчет прибыли.");
        int rent = 5000;
        int yearRent = rent * 12;
        int sales = 13000;
        int yearSales = sales * 12;
        int costPrice = 9000;
        int yearCostPrice = costPrice * 12;
        if (sales <= 13000 && costPrice <= 9000) {
            System.out.println("Прибыль за год " + (yearSales - yearCostPrice - yearRent));
        } else if (sales > 13000 && costPrice > 9000) {
            System.out.println("Прибыль за год " + (yearSales - yearCostPrice - yearRent));
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