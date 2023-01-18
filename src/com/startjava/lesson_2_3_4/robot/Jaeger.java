package com.startjava.lesson_2_3.robot;
public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int strength;
    private int armor;
    private int speed;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, double height,
                double weight, int strength, int armor, int speed) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
        this.speed = speed;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }

    @Override
    public String toString() {
            return "ModelName: " + modelName + "\nMark: " + mark + "\nOrigin: " + origin + 
            "\nHeight: " + height + " m" + "\nWeight: " + weight + " tons" + 
            "\nStrength: " + strength + "\nArmor: " + armor + "\nSpeed: " + speed;
    }
}