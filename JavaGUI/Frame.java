package JavaGUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame {

    JButton button; // make it become global variable
    Frame() {

        button = new JButton();
        button.setBounds(250, 250, 200, 55);
        button.setText("Play Now");
        button.setFocusable(false);
        button.addActionListener(e -> System.out.println("Don touchh me !"));
        button.setFont(new Font("Helvetica Neue", Font.BOLD, 10));
        button.setForeground(Color.green);
        button.setBackground(Color.blue);

        this.setSize(500, 500);
        this.setLayout(null);
        this.add(button);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
