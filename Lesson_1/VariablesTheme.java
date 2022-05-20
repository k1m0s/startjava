public class VariablesTheme {
    public static void main(String[] args)
    {
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
        float tmpNum = fMax;
        fMax = fMin;
        fMin = tmpNum;
        System.out.println("fMax = " + fMax);
        System.out.println("fMin = " + fMin);

        System.out.println("\n" + "6-Вывод символов и их кодов.");
        char sharp = 35;
        char ampersand = 38;
        char at = 64;
        char caret = 94;
        char underscoreСonclusion = 95;
        System.out.println("35 - " + sharp + "\n" + "38 - " + ampersand + "\n" + "64 - " + at ); 
        System.out.println("94 - " + caret + "\n" + "95 - " + underscoreСonclusion);

        System.out.println("\n" + "7-Произведение и сумма цифр числа.");
        int srcNum = 345;
        int srcUnits = srcNum % 10;
        int decimal = srcNum / 10;
        int srcDozens = decimal % 10;
        int srcHundreds = decimal / 10;
        int sumNum = srcHundreds + srcDozens + srcUnits;
        int productNum = srcHundreds * srcDozens * srcUnits;
        System.out.println("Сумма цифр числа 345 = " + sumNum);
        System.out.println("Произведение цифр числа 345 = " + productNum);

        System.out.println("\n" + "8-Вывод на консоль ASCII-арт Дюка.");
        char space = 32; 
        char backslash = 47;
        char slash = 92;
        char underscore = 95;
        char openParent = 40;
        char closeParent = 41;
        System.out.println("" + space + space + space + space + backslash + slash + "");
        System.out.println("" + space + space + space + backslash + space + space + slash + "");
        System.out.println("" + space + space + backslash + underscore + openParent + space + closeParent + slash + "");
        System.out.println("" + space + backslash + space + space + space + space + space + space + slash + "");
        System.out.println("" + backslash + underscore + underscore + underscore + underscore + backslash + 
            slash + underscore + underscore + slash + "");

        System.out.println("\n" + "9-Отображение количества сотен, десятков и единиц числа.");
        int number = 123;
        int hundreds = number / 100;
        int dozens = number / 10 % 10;
        int units = number % 10;
        System.out.println("Число 123 содержит:" + "\n" + hundreds + " - Сотен.");
        System.out.println(dozens + " - Десятков." + "\n" + units + " - Единиц.");

        System.out.println("\n" + "10-Преобразование секунд.");
        int numberTime = 86399;
        int second = numberTime % 60;
        int hour = numberTime / 60;
        int minutes = hour % 60;
        hour = hour / 60;
        System.out.println( hour + ":" + minutes + ":" + second);
    }
}