package unit1corejava.question3;
// Abstraction: abstract class
abstract class Fruit {

    // Encapsulation
    private String name;
    private String color;

    // Constructor
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Getters and setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Abstraction
    public abstract void taste();

    // Common method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }
}