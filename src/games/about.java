package games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class about extends JFrame implements ActionListener {

    JLabel lb2;
    JButton bt1;

    about() {
        setLayout(null);

        lb2 = new JLabel("About the project :-");
        lb2.setFont(new Font("Arial Black", Font.BOLD, 30));
        lb2.setBounds(10, 20, 1000, 40);
        add(lb2);

        lb2 = new JLabel(" -> This is a gaming project.");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 70, 1000, 25);
        add(lb2);

        lb2 = new JLabel(" -> Coding is done in core java.");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 100, 1000, 25);
        add(lb2);

        lb2 = new JLabel("Made By :-");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 160, 1000, 25);
        add(lb2);

        lb2 = new JLabel("VINEET KUMAR");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 200, 1000, 25);
        add(lb2);

        bt1 = new JButton("Cancel");
        bt1.setFont(new Font("Arial Black", Font.BOLD, 20));
        bt1.setBounds(190, 300, 150, 30);
        add(bt1);

        bt1.addActionListener(this);
        getContentPane().setBackground(new Color(155, 175, 250));

        setVisible(true);
        setTitle("About Us");
        setSize(510, 370);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(450, 170);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            this.dispose();
        }
    }

    public static void main(String args[]) {
        new about();
    }
}
