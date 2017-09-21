package games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class slmain extends JFrame implements ActionListener {

    ImageIcon img1, img2;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7;
    JButton bt1, bt2;

    slmain() {
        setLayout(null);

        img1 = new ImageIcon("C:\\Users\\vinet\\Documents\\NetBeansProjects\\2-in-1\\src\\games\\images\\board.jpg");
        lb1 = new JLabel("", img1, JLabel.CENTER);
        lb1.setBounds(0, 0, 1100, 700);
        add(lb1);

        bt1 = new JButton("DICE 1");
        bt1.setFont(new Font("Arial Black", Font.BOLD, 20));
        bt1.setBounds(1040, 50, 200, 40);
        add(bt1);

        bt2 = new JButton("DICE 2");
        bt2.setFont(new Font("Arial Black", Font.BOLD, 20));
        bt2.setBounds(1040, 120, 200, 40);
        add(bt2);

        lb3 = new JLabel("SCORE :");
        lb3.setFont(new Font("Arial Black", Font.BOLD, 25));
        lb3.setBounds(980, 480, 200, 30);
        add(lb3);

        lb4 = new JLabel("PLAYER 1");
        lb4.setFont(new Font("Arial Black", Font.BOLD, 25));
        lb4.setBounds(980, 540, 200, 30);
        add(lb4);

        lb5 = new JLabel("PLAYER 2");
        lb5.setFont(new Font("Arial Black", Font.BOLD, 25));
        lb5.setBounds(980, 580, 200, 30);
        add(lb5);

        lb6 = new JLabel("00");
        lb6.setFont(new Font("Arial Black", Font.BOLD, 25));
        lb6.setBounds(1200, 540, 200, 30);
        add(lb6);

        lb7 = new JLabel("00");
        lb7.setFont(new Font("Arial Black", Font.BOLD, 25));
        lb7.setBounds(1200, 580, 200, 30);
        add(lb7);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);

        setBackground(Color.GREEN);

        setVisible(true);
        setTitle("Snake & Ladder");
        setSize(1370, 730);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0, 0);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            img2 = new ImageIcon("C:\\Users\\vinet\\Documents\\NetBeansProjects\\2-in-1\\src\\games\\images\\1.jpg");
            lb2 = new JLabel("", img2, JLabel.CENTER);
            lb2.setBounds(1040, 230, 200, 190);
            add(lb2);
        }
    }

    public static void main(String[] args) {
        new slmain();
    }
}
