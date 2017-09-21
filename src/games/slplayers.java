package games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class slplayers extends JFrame implements ActionListener {
    
    JTextField t1, t2;
    JLabel lb1, lb2;
    JButton bt1;
    
    slplayers() {
        setLayout(null);
        
        lb1 = new JLabel("Player 1");
        lb1.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 20));
        lb1.setBounds(50, 100, 150, 20);
        add(lb1);
        
        lb2 = new JLabel("Player 2");
        lb2.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 20));
        lb2.setBounds(50, 200, 150, 20);
        add(lb2);
        
        t1 = new JTextField();
        t1.setBounds(180, 100, 150, 25);
        add(t1);
        
        t1 = new JTextField();
        t1.setBounds(180, 200, 150, 25);
        add(t1);
        
        bt1 = new JButton("START");
        bt1.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 20));
        bt1.setBounds(120,280,130,50);
        add(bt1);
        
        bt1.addActionListener(this);
        
        setVisible(true);
        setTitle("Snake & Ladder");
        setSize(1370, 730);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0, 0);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==bt1)
        {
            new slmain();
            this.dispose();
        }
    }
    public static void main(String[] args) {
        new slplayers();        
    }
    
}
