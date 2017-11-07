package games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class puzzle3 extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, bt1, bt2;
    static JLabel lb1,lb2,lb3;
    static int i;

    puzzle3() {
        setLayout(null);

        lb1 = new JLabel("PUZZLE 3");
        lb1.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 100));
        lb1.setBounds(400, 50, 700, 100);
        add(lb1);

        b1 = new JButton("5");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 60));
        b1.setBackground(new Color(205,133,63));
        b1.setBounds(160, 220, 150, 130);
        add(b1);

        b2 = new JButton("2");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 60));
        b2.setBackground(new Color(205,133,63));
        b2.setBounds(330, 220, 150, 130);
        add(b2);

        b3 = new JButton("7");
        b3.setFont(new Font("Times New Roman", Font.BOLD, 60));
        b3.setBackground(new Color(205,133,63));
        b3.setBounds(500, 220, 150, 130);
        add(b3);

        b4 = new JButton(" ");
        b4.setFont(new Font("Times New Roman", Font.BOLD, 60));
        b4.setBackground(new Color(205,133,63));
        b4.setBounds(160, 370, 150, 130);
        add(b4);

        b5 = new JButton("1");
        b5.setFont(new Font("Times New Roman", Font.BOLD, 60));
        b5.setBackground(new Color(205,133,63));
        b5.setBounds(330, 370, 150, 130);
        add(b5);

        b6 = new JButton("4");
        b6.setFont(new Font("Times New Roman", Font.BOLD, 60));
        b6.setBackground(new Color(205,133,63));
        b6.setBounds(500, 370, 150, 130);
        add(b6);

        b7 = new JButton("3");
        b7.setFont(new Font("Times New Roman", Font.BOLD, 60));
        b7.setBackground(new Color(205,133,63));
        b7.setBounds(160, 520, 150, 130);
        add(b7);

        b8 = new JButton("6");
        b8.setFont(new Font("Times New Roman", Font.BOLD, 60));
        b8.setBackground(new Color(205,133,63));
        b8.setBounds(330, 520, 150, 130);
        add(b8);

        b9 = new JButton("8");
        b9.setFont(new Font("Times New Roman", Font.BOLD, 60));
        b9.setBackground(new Color(205,133,63));
        b9.setBounds(500, 520, 150, 130);
        add(b9);

        bt1 = new JButton("REFRESH");
        bt1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        bt1.setBackground(new Color(205,133,63));
        bt1.setBounds(900, 390, 200, 50);
        add(bt1);

        bt2 = new JButton("QUIT");
        bt2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        bt2.setBackground(new Color(205,133,63));
        bt2.setBounds(900, 470, 200, 50);
        add(bt2);

        lb2 = new JLabel("TIMER   -");
        lb2.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 40));
        lb2.setBounds(810, 220, 230, 100);
        add(lb2);

        lb3 = new JLabel();
        lb3.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 40));
        lb3.setBounds(1060, 220, 220, 100);
        add(lb3);

        timer t = new timer();
        t.start();
        getContentPane().setBackground(new Color(155, 195, 10));

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
                JOptionPane.showMessageDialog(puzzle3.this, "You have completed the Puzzle 3.");
                new puzzle4();
                this.dispose();
            }
        }
        if (ae.getSource() == bt1) {
            new puzzle3();
            this.dispose();
        }
        if (ae.getSource() == bt2) {
            JOptionPane.showMessageDialog(puzzle3.this, "You will lost all the progress by quiting the game.");
            new Games();
            this.dispose();
        }
    }

    public static void main(String[] args) {
        new puzzle3();
    }

}

class timer extends Thread {

    int min, sec;

    public void run() {
        try {
            for (puzzle1.i = 120; puzzle1.i >= 0; puzzle1.i--) {
                min = puzzle1.i / 60;
                sec = puzzle1.i % 60;
                if (sec >= 0 && sec <= 9) {
                    puzzle1.lb3.setText("0" + min + ":0" + sec);
                } else {
                    puzzle1.lb3.setText("0" + min + ":" + sec);
                }
                long delay = 1000;
                Thread.sleep(delay);
            }
            if (puzzle1.i < 0) {
            }
        } catch (Exception e) {
        }
    }
}
