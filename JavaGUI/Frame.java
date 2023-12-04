package JavaGUI;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Frame extends JFrame implements ActionListener {

    Button button; // make it become global variable
    Frame() {

        button = new Button();
        button.setBounds(250, 250, 100, 25);
        button.addActionListener(this);

        this.setSize(500, 500);
        this.setLayout(null);
        this.add(button);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("Dont touch me!!!");
        }
    }
}
