package games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class puzzlentery extends JFrame implements ActionListener{

    JButton bt1,bt2;
    JLabel lb1;
    ImageIcon img;
    
    puzzlentery()
    {
        setLayout(null);
        
        
//        img = new ImageIcon("C:\\Users\\vinet\\Documents\\NetBeansProjects\\2-in-1\\src\\games\\brain.jpg");
//        lb1 = new JLabel("",img,JLabel.CENTER);
//        //setContentPane(new JLabel(new ImageIcon("brain.jpg")));
//        lb1.setBounds(0,0,1100,700);
//        add(lb1);
//        
        
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\vinet\\Documents\\NetBeansProjects\\2-in-1\\src\\games\\images\\brain1.jpg")));
        //lb1.setBounds(0,0,500,700);
        
        bt1 = new JButton("PLAY");
        bt1.setFont(new Font("Arial Black", Font.ITALIC, 25));
        bt1.setBounds(550, 380, 200, 60);
        add(bt1);

        bt2 = new JButton("EXIT");
        bt2.setFont(new Font("Arial Black", Font.ITALIC, 25));
        bt2.setBounds(550, 480, 200, 60);
        add(bt2);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        setVisible(true);
        setTitle("Brain Game");
        setSize(1370, 730);
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
        else
        {
            this.dispose();
        }
    }
    public static void main(String[] args)
    {
        new puzzlentery();
    }
}
