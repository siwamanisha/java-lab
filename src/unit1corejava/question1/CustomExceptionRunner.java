package unit1corejava.question1;

// Main Runner Class
public class CustomExceptionRunner {

    public static void main(String[] args) {
        System.out.println("Question1: Exception Handling");

        Student student = new Student("Manisha", 120);

        student.displayDetails();

        try {
            student.checkResult();
        }

        catch (InvalidMarksException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}