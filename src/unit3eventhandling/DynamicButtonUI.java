package  unit3eventhandling;
import javax.swing.*;
import java.awt.event.*;

public class DynamicButtonUI {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Dynamic UI Update");

        // Create label
        JLabel label = new JLabel("Click the button");

        // Create button
        JButton button = new JButton("Click Me");

        // Set positions
        label.setBounds(120, 50, 200, 30);
        button.setBounds(100, 100, 120, 40);

        // Add ActionListener to button
        button.addActionListener(new ActionListener() {
            int count = 0;

            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Button clicked " + count + " times");
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(button);

        // Frame settings
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}