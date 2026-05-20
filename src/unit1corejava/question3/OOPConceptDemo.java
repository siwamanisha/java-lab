
package unit1corejava.question3;
public class OOPConceptDemo {

    public static void main(String[] args) {

        // Creating objects
        Apple apple = new Apple("Apple", "Red");
        Mango mango = new Mango("Mango", "Yellow");

        // Encapsulation in action
        apple.setColor("Green");
        mango.setName("Alphonso Mango");

        // Display details
        System.out.println("Apple Details:");
        apple.displayInfo();
        apple.taste();

        System.out.println("\nMango Details:");
        mango.displayInfo();
        mango.taste();

        // Polymorphism using parent reference
        System.out.println("\nPolymorphism Example:");

        Fruit f1 = new Apple("Green Apple", "Green");
        Fruit f2 = new Mango("Mango", "Yellow");

        f1.taste();
        f2.taste();
    }
}