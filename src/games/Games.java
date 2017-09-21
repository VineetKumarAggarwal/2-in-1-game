package games;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Games extends JFrame implements ActionListener {

    JButton bt1, bt2;
    JLabel lb1;

    Games() {
        setLayout(null);

        lb1 = new JLabel("2-in-1 Games");
        lb1.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 80));
        lb1.setBounds(360, 80, 700, 100);
        add(lb1);

        bt1 = new JButton("Snake & Ladder");
        bt1.setFont(new Font("Arial Black", Font.ITALIC, 30));
        bt1.setBounds(500, 360, 350, 80);
        add(bt1);

        bt2 = new JButton("Number Puzzle");
        bt2.setFont(new Font("Arial Black", Font.ITALIC, 30));
        bt2.setBounds(500, 480, 350, 80);
        add(bt2);

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        setVisible(true);
        setTitle("Games");
        setSize(1370, 730);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0, 0);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            new slentery();
            this.dispose();
        } else {
            new puzzlentery();
            this.dispose();
        }
    }

    public static void main(String[] args) {
        Games games = new Games();
    }

}
