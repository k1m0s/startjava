public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("3");
        jaeger1.setOrigin("USA");
        jaeger1.setHeight(79.2);
        jaeger1.setWeight(1.9);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);
        jaeger1.setSpeed(7);
        System.out.println("First Jaeger");
        System.out.println("Model Name: " + jaeger1.getModelName());
        System.out.println("Mark: " + jaeger1.getMark());
        System.out.println("Origin: " + jaeger1.getOrigin());
        System.out.println("Height: " + jaeger1.getHeight() + " m");
        System.out.println("Weight: " + jaeger1.getWeight() + " tons");
        System.out.println("Strength: " + jaeger1.getStrength());
        System.out.println("Armor: " + jaeger1.getArmor());
        System.out.println("Speed: " + jaeger1.getSpeed());
        jaeger1.drift();
        jaeger1.move();
        jaeger1.scanKaiju();
        jaeger1.useVortexCannon();

        System.out.println("\nSecond Jaeger");
        Jaeger jaeger2 = new Jaeger("Striker Eureka", "5", "USA", 76.2, 1.85, 10, 9, 6);
        System.out.println(jaeger2);
        jaeger2.drift();
        jaeger2.move();
        jaeger2.scanKaiju();
        jaeger2.useVortexCannon();
    }
}