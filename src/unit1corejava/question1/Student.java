package unit1corejava.question1;

// Student Class
public class Student {

    private String name;
    private int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to check result
    public void checkResult() throws InvalidMarksException {

        if (marks < 0 || marks > 100) {

            throw new InvalidMarksException(
                    "Invalid marks entered for " + name +
                            ". Marks should be between 0 and 100."
            );
        }

        if (marks >= 40) {
            System.out.println(name + " has PASSED.");
        } else {
            System.out.println(name + " has FAILED.");
        }
    }

    // Display Student Details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}