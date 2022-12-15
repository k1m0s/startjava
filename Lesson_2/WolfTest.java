public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("Мужской");
        wolf.setName("Джони");
        wolf.setWeight(25);
        wolf.setAge(5);
        wolf.setColor("Черный");

        System.out.println("Описания волка.");
        System.out.println("Пол: " + wolf.getSex());
        System.out.println("Имя: " + wolf.getName());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Возраст: " + wolf.getAge());
        System.out.println("Цвет: " + wolf.getColor());
    }
}