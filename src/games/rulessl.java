package games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class rulessl extends JFrame implements ActionListener {

    JLabel lb1, lb2;
    JButton bt1;

    rulessl() {
        setLayout(null);

        lb1 = new JLabel("Rules :-");
        lb1.setFont(new Font("Arial Black", Font.BOLD, 20));
        lb1.setBounds(10, 10, 1000, 20);
        add(lb1);

        lb2 = new JLabel("1. Players can start their game by getting 1 or 6 only and move");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 50, 1000, 25);
        add(lb2);

        lb2 = new JLabel("    their mark by getting the number on the dice.");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 80, 1000, 25);
        add(lb2);

        lb2 = new JLabel("2. Players who get 3 times 6 number in sequence at a time are");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 110, 1000, 25);
        add(lb2);

        lb2 = new JLabel("    not executed.");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 140, 1000, 25);
        add(lb2);

        lb2 = new JLabel("3. Players can cut the mark of another player and send them ");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 170, 1000, 25);
        add(lb2);

        lb2 = new JLabel("    back to the home and start over again.");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 200, 1000, 25);
        add(lb2);

        lb2 = new JLabel("4. Player who reach to the 100 mark will win the game.");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 230, 1000, 25);
        add(lb2);

        lb2 = new JLabel("5. Players can get the chance to climb the ladder and get bite");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 260, 1000, 25);
        add(lb2);

        lb2 = new JLabel("    by the snakes.");
        lb2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lb2.setBounds(10, 290, 1000, 25);
        add(lb2);

        bt1 = new JButton("Cancel");
        bt1.setFont(new Font("Arial Black", Font.BOLD, 20));
        bt1.setBounds(280, 320, 150, 30);
        add(bt1);

        bt1.addActionListener(this);
        getContentPane().setBackground(new Color(155, 175, 250));

        setVisible(true);
        setTitle("Snake & Ladder Rules");
        setSize(710, 390);
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
        new rulessl();
    }
}
