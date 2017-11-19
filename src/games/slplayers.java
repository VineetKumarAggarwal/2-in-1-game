package games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class slplayers extends JFrame implements ActionListener {

    JTextField t1, t2;
    JLabel lb1, lb2, lb3;
    JButton bt1;
    String a, b;
    ImageIcon img;

    slplayers() {
        setLayout(null);

        lb1 = new JLabel("Player 1");
        lb1.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 40));
        lb1.setBounds(580, 50, 240, 60);
        add(lb1);

        lb2 = new JLabel("Player 2");
        lb2.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 40));
        lb2.setBounds(580, 140, 240, 60);
        add(lb2);

        t1 = new JTextField();
        t1.setBounds(1020, 60, 200, 40);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(1020, 150, 200, 40);
        add(t2);

        bt1 = new JButton("START");
        bt1.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 20));
        bt1.setBounds(1050, 280, 130, 50);
        add(bt1);

        img = new ImageIcon("C:\\Users\\vinet\\Documents\\NetBeansProjects\\2-in-1\\src\\games\\images\\snake-ladder.jpg");
        lb3 = new JLabel("", img, JLabel.CENTER);
        lb3.setBounds(0, 0, 980, 700);
        add(lb3);

        getContentPane().setBackground(new Color(100, 200, 100));
        bt1.addActionListener(this);

        setVisible(true);
        setTitle("Snake & Ladder");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0, 0);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            if (!t1.getText().equals(t2.getText())) {
                if (t1.getText().length() > 0 && t2.getText().length() > 0) {
                    if (t1.getText().length() < 9 && t2.getText().length() < 9) {
                        String info[] = new String[2];
                        info[0] = t1.getText();
                        info[1] = t2.getText();
                        slmain.main(info);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Length should be less than 9.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "You have to enter the name for the player.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Name of the players can not be same.");
            }
        }
    }

    public static void main(String[] args) {
        new slplayers();
    }

}
