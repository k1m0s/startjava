public class VariablesTheme {
    public static void main(String[] args){
        System.out.println("1-Создание переменных и вывод их значений на консоль.");
        byte cpu = 3;
        short cp = 2200;
        int price = 30000;
        long numberTansisters = 624000000;
        float ram = 8.00f;
        double inches = 15.6;
        char model = 'S';
        boolean isTrue = true;
        System.out.println("Процессор: i" + cpu);
        System.out.println("Тактовая частота: " + cp + " МГц");
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Число транзисторов: " + numberTansisters);
        System.out.println("Оперативная память: " + ram + " ГБ");
        System.out.println("Дисплей: " + inches);
        System.out.println("Модель: " + model);
        System.out.println(isTrue + "\n");

        System.out.println("2-Расчет стоимости товара со скидкой.");
        double butter = 100;
        double bread = 200;
        double sum = butter + bread;
        double discount = sum * 11 / 100;
        double newPrice = sum - discount;
        System.out.println("Cумма скидки: " + discount);
        System.out.println("Общая стоимость товаров со скидкой: " + newPrice + "\n");

        System.out.println("3-Вывод на консоль слова JAVA.");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a"  + "\n"); 

        System.out.println("4-Отображение min и max значений числовых типов данных.");
        byte b = Byte.MAX_VALUE;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE;
        System.out.println("Byte:" + "\n" + b + "\n" + ++b + "\n" + --b + "\n");
        System.out.println("Short:" + "\n" + s + "\n" + ++s + "\n" + --s + "\n");
        System.out.println("Int:" + "\n" + i + "\n" + ++i + "\n" + --i + "\n");
        System.out.println("Long:" + "\n" + l + "\n" + ++l + "\n" + --l);

        System.out.println("\n" + "5-Перестановка значений переменных.");
        float fMax = Float.MAX_VALUE;
        float fMin = Float.MIN_VALUE;
        float replace = fMax;
        fMax = fMin;
        fMin = replace;
        System.out.println("fMax = " + fMax);
        System.out.println("fMin = " + fMin);

        System.out.println("\n" + "6-Вывод символов и их кодов.");
        int sharp,ampersand,at,caret,underscoreСonclusion; 
        sharp = 35;
        ampersand = 38;
        at = 64;
        caret = 94;
        underscoreСonclusion = 95;
        System.out.println("35 - " + (char)sharp + "\n" + "38 - " + (char)ampersand + "\n" + "64 - " + (char)at + "\n" + "94 - " + (char)caret + "\n" + "95 - " + (char)underscoreСonclusion); 
        
        System.out.println("\n" + "7-Произведение и сумма цифр числа.");
        int num = 345;
        int sumNum = 0;
        int five, decimal, four, three;
        five = num % 10;
        decimal = num / 10;
        four = decimal % 10;
        three = decimal / 10;
        System.out.println("Сумма цифр числа 345 = " + (three + four + five));
        System.out.println("Произведение цифр числа 345 = " + (three * four * five));

        System.out.println("\n" + "8-Вывод на консоль ASCII-арт Дюка.");
        int space, leftSlash, rightSlash, underscore, openParent, closeParent;
        space = 32; 
        leftSlash = 47;
        rightSlash = 92;
        underscore = 95;
        openParent = 40;
        closeParent = 41;
        System.out.println((char)space + "" + (char)space + "" + (char)space + "" + (char)space + "" + (char)leftSlash + "" + (char)rightSlash);
        System.out.println((char)space + "" + (char)space + "" + (char)space + "" + (char)leftSlash + "" + (char)space + "" + (char)space + "" + (char)rightSlash);
        System.out.println((char)space + "" + (char)space + "" + (char)leftSlash + "" + (char)underscore + "" + (char)openParent + "" + (char)space + "" + (char)closeParent + "" + (char)rightSlash);
        System.out.println((char)space + "" + (char)leftSlash + "" + (char)space + "" + (char)space + "" + (char)space + "" + (char)space + "" + (char)space + "" + (char)space + "" + (char)rightSlash);
        System.out.println((char)leftSlash + "" + (char)underscore + "" + (char)underscore + "" + (char)underscore + "" + (char)underscore + "" + (char)leftSlash + "" + (char)rightSlash + "" + (char)underscore + "" + (char)underscore + "" + (char)rightSlash);

        System.out.println("\n" + "9-Отображение количества сотен, десятков и единиц числа.");
        int number, hundreds, dozens, units;
        number = 123;
        hundreds = number / 100;
        dozens = number / 10 % 10;
        units = number % 10;
        System.out.println("Число 123 содержит:" + "\n" + hundreds + " - Сотен." + "\n" + dozens + " - Десятков." + "\n" + units + " - Единиц." );

        System.out.println("\n" + "10-Преобразование секунд.");
        int numberTime = 86399;
        int second = numberTime % 60;
        int hour = numberTime / 60;
        int minutes = hour % 60;
        hour = hour / 60;
        System.out.println( hour + ":" + minutes + ":" + second);
        
    }
}