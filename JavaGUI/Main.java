package JavaGUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("gtavlogo.png");
        Border border = BorderFactory.createLineBorder(Color.black,2);

        JLabel label = new JLabel();
        label.setText("[ PRESS SPACE TO START THE GAME ]"); // display text
        label.setIcon(image); // display image
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT/CENTER/RIGHT relative to the image
        label.setVerticalTextPosition(JLabel.BOTTOM); // set text TOP/CENTER/BOTTOM relative to the image
        label.setForeground(new Color(0x00b4d8)); // set the colour of text
        label.setFont(new Font("Helvetica Neue", Font.BOLD, 30)); // set font of text
        label.setIconTextGap(100); // set gap of text to image
        label.setBackground(new Color(0xcaf0f8)); // set background colour
        label.setOpaque(true); // display background colour, remember the label like to take as much space as it can
        label.setBorder(border); // create border
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of text & image within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of text & image within label
        label.setBounds(50, 50, 720, 720); // set x,y position within frame as well as dimensions


        JFrame frame = new JFrame(); 
        frame.setTitle("GTA 6"); 
        frame.setSize(820,820); 

        // remember to add label before set visible
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}