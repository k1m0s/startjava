public class VariablesTheme {
    public static void main(String[] args){
    
        System.out.println("1-Создание переменных и вывод их значений на консоль.");
        byte cpu = 3;
        System.out.println("Процессор: i" + cpu);
        short cp = 2200;
        System.out.println("Тактовая частота: " + cp + " МГц");
        int price = 30000;
        System.out.println("Цена: " + price + " руб.");
        long numberTansisters = 624000000;
        System.out.println("Число транзисторов: " + numberTansisters);
        float ram = 8.00f;
        System.out.println("Оперативная память: " + ram + " ГБ");
        double inches = 15.6;
        System.out.println("Дисплей: " + inches);
        char model = 'S';
        System.out.println("Модель: " + model);
        boolean isTrue = true;
        System.out.println(isTrue + "\n");

        System.out.println("2-Расчет стоимости товара со скидкой.");
        double x , y;
        x = 100;
        y = 200;
        double sum = x + y;
        double percent = 11;
        double value = sum * percent / 100;
        double newPrice = sum - value;
        System.out.println("Cумма скидки: " + value);
        System.out.println("Общуя стоимость товаров со скидкой: " + newPrice + "\n");

        System.out.println("3-Вывод на консоль слова JAVA.");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");


    }
}