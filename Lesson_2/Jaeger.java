public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int strength;
    private int armor;
    private int speed;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, double height, double weight, int strength, int armor, int speed) {
        this.setModelName(modelName);
        this.setMark(mark);
        this.setOrigin(origin);
        this.setHeight(height);
        this.setWeight(weight);
        this.setStrength(strength);
        this.setArmor(armor);
        this.setSpeed(speed);
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
        System.out.println("Model Name: " + modelName);
    }

    public void setMark(String mark) {
        this.mark = mark;
        System.out.println("Mark: " + mark);
    }

    public void setOrigin(String origin) {
        this.origin = origin;
        System.out.println("Origin: " + origin);
    }

    public void setHeight(double height) {
        this.height = height;
        System.out.println("Height: " + height + " m");
    }

    public void setWeight(double weight) {
        this.weight = weight;
        System.out.println("Weight: " + weight + " Tons");
    }

    public void setStrength(int strength) {
        this.strength = strength;
        System.out.println("Strength: " + strength);
    }

    public void setArmor(int armor) {
        this.armor = armor;
        System.out.println("Armor: " + armor);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed: " + speed);
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
        return "\n ModelName: " + modelName + "\n Mark: " + mark + "Origin: " + origin + "\n Height: " 
        + height + " m" + "\n Weight: " + weight + "tons" + "\n Strength: " + strength + "dexterity" 
        + "\n Armor: " + armor + "\n Speed: " + speed + "\n";
    }
}