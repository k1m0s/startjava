package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        System.out.println("First Jaeger");
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "3", "USA", 79.2, 1.9, 8, 6, 7);
        System.out.println(gipsyDanger);
        gipsyDanger.drift();
        gipsyDanger.move();
        gipsyDanger.scanKaiju();
        gipsyDanger.useVortexCannon();

        System.out.println("\nSecond Jaeger");
        Jaeger strikerEureka = new Jaeger("Striker Eureka", "5", "USA", 76.2, 1.85, 10, 9, 6);
        System.out.println(strikerEureka);
        strikerEureka.drift();
        strikerEureka.move();
        strikerEureka.scanKaiju();
        strikerEureka.useVortexCannon();
    }
}