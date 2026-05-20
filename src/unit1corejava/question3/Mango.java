

package unit1corejava.question3;
// Inheritance
class Mango extends Fruit {

    public Mango(String name, String color) {
        super(name, color);
    }

    // Polymorphism
    @Override
    public void taste() {
        System.out.println(getName() + " tastes very sweet and juicy.");
    }
}