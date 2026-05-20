package unit1corejava.question2;

import unit1corejava.question2.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Serialization Class
public class StudentSerialization {

    public static void main(String[] args) {

        Student student = new Student(1, "Manisha", 89.5);

        try {

            // Creating file output stream
            FileOutputStream file =
                    new FileOutputStream("student.txt");

            // Creating object output stream
            ObjectOutputStream out =
                    new ObjectOutputStream(file);

            // Writing object to file
            out.writeObject(student);

            out.close();
            file.close();

            System.out.println("Student object serialized successfully.");

        }

        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}