public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        System.out.println("First Jaeger");
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("3");
        jaeger1.setOrigin("USA");
        jaeger1.setHeight(79.2);
        jaeger1.setWeight(1.9);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);
        jaeger1.setSpeed(7);
        jaeger1.drift();
        jaeger1.move();
        jaeger1.scanKaiju();
        jaeger1.useVortexCannon();

        System.out.println("\n Second Jaeger");
        Jaeger jaeger2 = new Jaeger("Striker Eureka", "Mark-5", "USA", 76.2, 1.85, 10, 9, 6);
        jaeger2.drift();
        jaeger2.move();
        jaeger2.scanKaiju();
        jaeger2.useVortexCannon();
    }
}