public class WolfTest {
    public static void main(String[] args) {
        Wolf description = new Wolf();
        description.sex = "Мальчик";
        description.name = "Джони";
        description.weight = 25;
        description.age = 5;
        description.color = "Черный";

        System.out.println(description.sex);
        System.out.println(description.name);
        System.out.println(description.weight);
        System.out.println(description.age);
        System.out.println(description.color);
    }
}