package games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class rulesnp extends JFrame implements ActionListener {

    JLabel lb1, lb2;
    JButton bt1;

    rulesnp() {
        setLayout(null);

        lb1 = new JLabel("Rules :-");
        lb1.setFont(new Font("Arial Black", Font.BOLD, 20));
        lb1.setBounds(10, 10, 1000, 20);
        add(lb1);

        lb2 = new JLabel("1. Players can choose the modes in which mode they want to");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 50, 1000, 25);
        add(lb2);

        lb2 = new JLabel("    play the puzzles.");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 80, 1000, 25);
        add(lb2);

        lb2 = new JLabel("2. Both the modes (difficult, easy) contains different layout of");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 110, 1000, 25);
        add(lb2);

        lb2 = new JLabel("    the puzzle.");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 140, 1000, 25);
        add(lb2);

        lb2 = new JLabel("3. Players can move to the next puzzle by completing the");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 170, 1000, 25);
        add(lb2);

        lb2 = new JLabel("    current puzzle in the given time.");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 200, 1000, 25);
        add(lb2);

        lb2 = new JLabel("4. Players have to complete the puzzle in the given time, other");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 230, 1000, 25);
        add(lb2);

        lb2 = new JLabel("    wise all the progress in the game is being lost.");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 260, 1000, 25);
        add(lb2);

        bt1 = new JButton("Cancel");
        bt1.setFont(new Font("Arial Black", Font.BOLD, 20));
        bt1.setBounds(280, 300, 150, 30);
        add(bt1);

        bt1.addActionListener(this);
        getContentPane().setBackground(new Color(155, 175, 250));

        setVisible(true);
        setTitle("Number Puzzle Rules");
        setSize(710, 370);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(340, 160);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            this.dispose();
        }
    }

    public static void main(String args[]) {
        new rulesnp();
    }
}
