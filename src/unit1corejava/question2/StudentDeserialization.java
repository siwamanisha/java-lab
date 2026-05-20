package unit1corejava.question2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// Deserialization Class
public class StudentDeserialization {

    public static void main(String[] args) {

        try {

            // Reading file
            FileInputStream file =
                    new FileInputStream("student.txt");

            // Reading object
            ObjectInputStream in =
                    new ObjectInputStream(file);

            // Convert object back to Student
            Student student =
                    (Student) in.readObject();

            in.close();
            file.close();

            System.out.println("Student object deserialized successfully.\n");

            student.displayStudent();
        }

        catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}