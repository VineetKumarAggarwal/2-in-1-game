package games;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class puzzlentery extends JFrame implements ActionListener{

    JButton bt1,bt2,bt3;
    JLabel lb1;
    ImageIcon img;
    
    puzzlentery()
    {
        setLayout(null);
        
        bt1 = new JButton("EASY MODE");
        bt1.setBackground(Color.DARK_GRAY);
        bt1.setForeground(Color.WHITE);
        bt1.setFont(new Font("Arial Black", Font.ITALIC, 25));
        bt1.setBounds(300, 500, 280, 80);
        add(bt1);

        bt2 = new JButton("DIFFICULT MODE");
        bt2.setBackground(Color.DARK_GRAY);
        bt2.setForeground(Color.WHITE);
        bt2.setFont(new Font("Arial Black", Font.ITALIC, 25));
        bt2.setBounds(770, 500, 280, 80);
        add(bt2);
        
        bt3 = new JButton("BACK");
        bt3.setBackground(Color.GRAY);
        bt3.setForeground(Color.WHITE);
        bt3.setFont(new Font("Arial Black", Font.ITALIC, 25));
        bt3.setBounds(615, 500, 120, 80);
        add(bt3);

        img = new ImageIcon("C:\\Users\\vinet\\Documents\\NetBeansProjects\\2-in-1\\src\\games\\images\\1.jpg");
        lb1 = new JLabel("", img,JLabel.CENTER);
        lb1.setBounds(190, 0, 970, 710);
        add(lb1);
                
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setVisible(true);
        setTitle("Brain Game");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0, 0);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bt1)
        {
            new puzzle1();
            this.dispose();
        }
        else if(ae.getSource()==bt2)
        {
            new puzzle8();
            this.dispose();
        }
        else if(ae.getSource()==bt3)
        {
            new Games();
            this.dispose();
        }
    }
    public static void main(String[] args)
    {
        new puzzlentery();
    }
}
