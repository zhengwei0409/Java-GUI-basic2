package JavaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        label.setText("User : ");
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel redPanel = new JPanel();
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setBackground(Color.red);
        redPanel.setLayout(new BorderLayout());
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());

        JPanel greePanel = new JPanel();
        greePanel.setBackground(Color.green);
        greePanel.setBounds(0, 250, 500, 250);
        redPanel.setLayout(new BorderLayout());

        
        frame.setSize(750,750);
        frame.setTitle("GTA 6");
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);

        frame.add(redPanel);
        frame.add(greePanel);
        frame.add(bluePanel);
        redPanel.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}