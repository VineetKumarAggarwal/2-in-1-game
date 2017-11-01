package games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class slentery extends JFrame implements ActionListener {

    JButton bt1, bt2;
    JLabel lb1;
    ImageIcon img;

    slentery() {
        setLayout(null);

        getContentPane().setBackground(new Color(107,142,35));
                
        bt1 = new JButton("PLAY");
        bt1.setFont(new Font("Arial Black", Font.ITALIC, 25));
        bt1.setBackground(new Color(205,133,63));
        bt1.setBounds(880, 270, 200, 50);
        add(bt1);

        bt2 = new JButton("BACK");
        bt2.setFont(new Font("Arial Black", Font.ITALIC, 25));
        bt2.setBackground(new Color(205,133,63));
        bt2.setBounds(880, 380, 200, 50);
        add(bt2);

        img = new ImageIcon("C:\\Users\\vinet\\Documents\\NetBeansProjects\\2-in-1\\src\\games\\images\\slentery.jpg");
        lb1 = new JLabel("", img,JLabel.CENTER);
        lb1.setBounds(190, 0, 970, 710);
        add(lb1);
                
        bt1.addActionListener(this);
        bt2.addActionListener(this);

        setVisible(true);
        setTitle("Snake & Ladder");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0, 0);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            new slplayers();
            this.dispose();
        } else {
            new Games();
            this.dispose();
        }
    }

    public static void main(String[] args) {
        new slentery();
    }
}
