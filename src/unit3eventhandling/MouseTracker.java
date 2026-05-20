package  unit3eventhandling;
import javax.swing.*;
import java.awt.event.*;

public class MouseTracker extends JFrame implements MouseListener {

    JLabel label;

    MouseTracker() {
        // Create label
        label = new JLabel("Click anywhere inside the window");
        label.setBounds(50, 50, 300, 30);

        // Add label
        add(label);

        // Add mouse listener
        addMouseListener(this);

        // Frame settings
        setSize(400, 300);
        setLayout(null);
        setTitle("Mouse Event Tracker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Mouse click event
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        label.setText("Mouse clicked at: (" + x + ", " + y + ")");
    }

    // Unused methods
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseTracker();
    }
}
