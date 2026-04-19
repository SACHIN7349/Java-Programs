package Swings;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/*
Develop a simple Swing program for illustrating mouse operations 
such as mouse down, mouse up, double click, single click 
with the help of a button.
*/

public class MouseExample implements MouseListener {

    JLabel l1;
    JButton b1;

    MouseExample() {
        JFrame f = new JFrame("Mouse Event Example");

        // Label
        l1 = new JLabel("Perform Mouse Operation");
        l1.setBounds(50, 50, 300, 40);
        l1.setFont(new Font("Arial", Font.BOLD, 16));

        // Button
        b1 = new JButton("Click Me");
        b1.setBounds(100, 120, 120, 50);

        // Add MouseListener to button
        b1.addMouseListener(this);

        // Add components
        f.add(l1);
        f.add(b1);

        // Frame settings
        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Mouse pressed (mouse down)
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Down");
    }

    // Mouse released (mouse up)
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Up");
    }

    // Mouse clicked (single / double click)
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            l1.setText("Double Click");
        } else {
            l1.setText("Single Click");
        }
    }

    public void mouseEntered(MouseEvent e) {
        // optional
    }

    public void mouseExited(MouseEvent e) {
        // optional
    }

    public static void main(String[] args) {
        new MouseExample();
    }
}