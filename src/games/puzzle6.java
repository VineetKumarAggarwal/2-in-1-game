package games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class puzzle6 extends JFrame implements ActionListener{
    
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, bt1, bt2;
    JLabel lb1;
   
    puzzle6() {

        setLayout(null);

        lb1 = new JLabel("PUZZLE 3");
        lb1.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 60));
        lb1.setBounds(520, 50, 700, 100);
        add(lb1);

        b1 = new JButton("4");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        b1.setBounds(200, 200, 100, 80);
        add(b1);

        b2 = new JButton("5");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 40));
        b2.setBounds(310, 200, 100, 80);
        add(b2);

        b3 = new JButton("6");
        b3.setFont(new Font("Times New Roman", Font.BOLD, 40));
        b3.setBounds(420, 200, 100, 80);
        add(b3);

        b4 = new JButton(" ");
        b4.setFont(new Font("Times New Roman", Font.BOLD, 40));
        b4.setBounds(200, 300, 100, 80);
        add(b4);

        b5 = new JButton("8");
        b5.setFont(new Font("Times New Roman", Font.BOLD, 40));
        b5.setBounds(310, 300, 100, 80);
        add(b5);

        b6 = new JButton("7");
        b6.setFont(new Font("Times New Roman", Font.BOLD, 40));
        b6.setBounds(420, 300, 100, 80);
        add(b6);

        b7 = new JButton("1");
        b7.setFont(new Font("Times New Roman", Font.BOLD, 40));
        b7.setBounds(200, 400, 100, 80);
        add(b7);

        b8 = new JButton("2");
        b8.setFont(new Font("Times New Roman", Font.BOLD, 40));
        b8.setBounds(310, 400, 100, 80);
        add(b8);

        b9 = new JButton("3");
        b9.setFont(new Font("Times New Roman", Font.BOLD, 40));
        b9.setBounds(420, 400, 100, 80);
        add(b9);

        bt1 = new JButton("REFRESH");
        bt1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        bt1.setBounds(850, 260, 200, 50);
        add(bt1);

        bt2 = new JButton("QUIT");
        bt2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        bt2.setBounds(850, 340, 200, 50);
        add(bt2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);

        setVisible(true);
        setTitle("Number Puzzle");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0, 0);
    }

    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == b1) {
            String s = b1.getLabel();
            if (b2.getLabel().equals(" ")) {
                b2.setLabel(s);
                b1.setLabel(" ");
            } else if (b4.getLabel().equals(" ")) {
                b4.setLabel(s);
                b1.setLabel(" ");
            }
        }//end of if  

        if (ae.getSource() == b3) {
            String s = b3.getLabel();
            if (b2.getLabel().equals(" ")) {
                b2.setLabel(s);
                b3.setLabel(" ");
            } else if (b6.getLabel().equals(" ")) {
                b6.setLabel(s);
                b3.setLabel(" ");
            }
        }//end of if  

        if (ae.getSource() == b2) {
            String s = b2.getLabel();
            if (b1.getLabel().equals(" ")) {
                b1.setLabel(s);
                b2.setLabel(" ");
            } else if (b3.getLabel().equals(" ")) {
                b3.setLabel(s);
                b2.setLabel(" ");
            } else if (b5.getLabel().equals(" ")) {
                b5.setLabel(s);
                b2.setLabel(" ");
            }
        }//end of if  

        if (ae.getSource() == b4) {
            String s = b4.getLabel();
            if (b1.getLabel().equals(" ")) {
                b1.setLabel(s);
                b4.setLabel(" ");
            } else if (b7.getLabel().equals(" ")) {
                b7.setLabel(s);
                b4.setLabel(" ");
            } else if (b5.getLabel().equals(" ")) {
                b5.setLabel(s);
                b4.setLabel(" ");
            }
        }//end of if  

        if (ae.getSource() == b5) {
            String s = b5.getLabel();
            if (b2.getLabel().equals(" ")) {
                b2.setLabel(s);
                b5.setLabel(" ");
            } else if (b4.getLabel().equals(" ")) {
                b4.setLabel(s);
                b5.setLabel(" ");
            } else if (b6.getLabel().equals(" ")) {
                b6.setLabel(s);
                b5.setLabel(" ");
            } else if (b8.getLabel().equals(" ")) {
                b8.setLabel(s);
                b5.setLabel(" ");
            }
        }//end of if  

        if (ae.getSource() == b6) {

            String s = b6.getLabel();
            if (b9.getLabel().equals(" ")) {
                b9.setLabel(s);
                b6.setLabel(" ");
            } else if (b3.getLabel().equals(" ")) {
                b3.setLabel(s);
                b6.setLabel(" ");
            } else if (b5.getLabel().equals(" ")) {
                b5.setLabel(s);
                b6.setLabel(" ");
            }

        }//end of if  

        if (ae.getSource() == b7) {
            String s = b7.getLabel();
            if (b4.getLabel().equals(" ")) {
                b4.setLabel(s);
                b7.setLabel(" ");
            } else if (b8.getLabel().equals(" ")) {
                b8.setLabel(s);
                b7.setLabel(" ");
            }

        }//end of if  

        if (ae.getSource() == b8) {
            String s = b8.getLabel();
            if (b7.getLabel().equals(" ")) {
                b7.setLabel(s);
                b8.setLabel(" ");
            } else if (b9.getLabel().equals(" ")) {
                b9.setLabel(s);
                b8.setLabel(" ");
            } else if (b5.getLabel().equals(" ")) {
                b5.setLabel(s);
                b8.setLabel(" ");
            }

        }//end of if  

        if (ae.getSource() == b9) {
            String s = b9.getLabel();
            if (b6.getLabel().equals(" ")) {
                b6.setLabel(s);
                b9.setLabel(" ");
            } else if (b8.getLabel().equals(" ")) {
                b8.setLabel(s);
                b9.setLabel(" ");
            }

            if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel()
                    .equals("3") && b4.getLabel().equals("4") && b5.getLabel().equals("5")
                    && b6.getLabel().equals("6") && b7.getLabel().equals("7") && b8.getLabel()
                    .equals("8") && b9.getLabel().equals(" ")) {
                JOptionPane.showMessageDialog(puzzle6.this, "You have completed the Puzzle 3.");
                new puzzle5();
                this.dispose();
            }
        }
        if (ae.getSource() == bt1) {
            new puzzle6();
            this.dispose();
        }
        if (ae.getSource() == bt2) {
            JOptionPane.showMessageDialog(puzzle6.this, "You will lost all the progress by quiting the game.");
            new Games();
            this.dispose();
        }        
    }
    public static void main(String[] args) {
        new puzzle6();
    }    
}
