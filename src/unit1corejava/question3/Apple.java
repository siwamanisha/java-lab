package unit1corejava.question3;

// Inheritance
class Apple extends Fruit {

    public Apple(String name, String color) {
        super(name, color);
    }

    // Polymorphism (method overriding)
    @Override
    public void taste() {
        System.out.println(getName() + " tastes sweet and crunchy.");
    }
}