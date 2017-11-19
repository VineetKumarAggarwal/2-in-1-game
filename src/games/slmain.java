package games;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class slmain extends JFrame implements ActionListener {

    static String text, text1;

    Image img2, img3, img4, img5, img6, img7, img1;
    Toolkit t = (Toolkit.getDefaultToolkit());
    Random r = new Random();
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7;
    JButton bt1, bt2, bt3, bt4;
    boolean start = false, start1 = false;
    int x = 0, p1 = 0, p2 = 0, count = 0, xpos, ypos;

    slmain() {

        setLayout(null);

        bt1 = new JButton();
        bt1.setText("" + text);
        bt1.setFont(new Font("Arial Black", Font.PLAIN, 20));
        bt1.setBackground(Color.RED);
        bt1.setForeground(Color.WHITE);
        bt1.setBounds(1080, 40, 220, 40);
        add(bt1);

        bt2 = new JButton();
        bt2.setText("" + text1);
        bt2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        bt2.setBackground(Color.BLUE);
        bt2.setForeground(Color.WHITE);
        bt2.setBounds(1080, 100, 220, 40);
        add(bt2);

        bt3 = new JButton("New Game");
        bt3.setFont(new Font("Arial Black", Font.PLAIN, 20));
        bt3.setBounds(1080, 560, 220, 40);
        add(bt3);

        bt4 = new JButton("Quit");
        bt4.setFont(new Font("Arial Black", Font.PLAIN, 20));
        bt4.setBounds(1080, 620, 220, 40);
        add(bt4);

        lb3 = new JLabel("SCORE :");
        lb3.setFont(new Font("Arial Black", Font.PLAIN, 18));
        lb3.setBounds(1060, 440, 200, 30);
        add(lb3);

        lb4 = new JLabel("" + text);
        lb4.setFont(new Font("Arial Black", Font.PLAIN, 18));
        lb4.setBounds(1060, 470, 200, 30);
        add(lb4);

        lb5 = new JLabel("" + text1);
        lb5.setFont(new Font("Arial Black", Font.PLAIN, 18));
        lb5.setBounds(1060, 510, 200, 30);
        add(lb5);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);

        img2 = t.createImage(getClass().getResource("1.jpg"));
        img3 = t.createImage(getClass().getResource("2.jpg"));
        img4 = t.createImage(getClass().getResource("3.jpg"));
        img5 = t.createImage(getClass().getResource("4.jpg"));
        img6 = t.createImage(getClass().getResource("5.jpg"));
        img7 = t.createImage(getClass().getResource("6.jpg"));
        img1 = t.createImage(getClass().getResource("board.jpg"));

        getContentPane().setBackground(new Color(100, 200, 100));

        setVisible(true);
        setTitle("Snake & Ladder");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0, 0);
    }

    public int snl(int x) {
        if (x == 4) {
            x = 14;
        }
        if (x == 9) {
            x = 31;
        }
        if (x == 20) {
            x = 38;
        }
        if (x == 28) {
            x = 84;
        }
        if (x == 36) {
            x = 44;
        }
        if (x == 42) {
            x = 63;
        }
        if (x == 51) {
            x = 67;
        }

        if (x == 62) {
            x = 81;
        }
        if (x == 71) {
            x = 90;
        }
        if (x == 25) {
            x = 3;
        }
        if (x == 56) {
            x = 48;
        }
        if (x == 59) {
            x = 1;
        }
        if (x == 69) {
            x = 32;
        }
        if (x == 83) {
            x = 57;
        }
        if (x == 91) {
            x = 73;
        }
        if (x == 94) {
            x = 26;
        }
        if (x == 99) {
            x = 80;
        }

        return x;
    }

    public void paint(Graphics g) {
        super.paint(g);
        String pl1 = Integer.toString(p1);
        String pl2 = Integer.toString(p2);

        g.drawImage(img1, 50, 20, 970, 720, this);

        g.setFont(new Font("Arial Black", Font.PLAIN, 20));

        g.drawString(pl1, 1200, 520);
        g.drawString(pl2, 1200, 560);

        switch (x) {
            case 1:
                g.drawImage(img2, 1102, 240, 180, 160, this);
                break;

            case 2:
                g.drawImage(img3, 1102, 240, 180, 160, this);
                break;

            case 3:
                g.drawImage(img4, 1102, 240, 180, 160, this);
                break;

            case 4:
                g.drawImage(img5, 1102, 240, 180, 160, this);
                break;

            case 5:
                g.drawImage(img6, 1102, 240, 180, 160, this);
                break;

            case 6:
                g.drawImage(img7, 1102, 240, 180, 160, this);
                break;
        }

        if (p1 == 0) {
            g.setColor(Color.RED);
            g.fillOval(10, 650, 35, 35);
        } else {
            calc_position(p1);
            g.setColor(Color.RED);
            g.fillOval(xpos, ypos, 35, 35);
        }
        if (p2 == 0) {
            g.setColor(Color.BLUE);
            g.fillOval(10, 600, 35, 35);
        } else {
            calc_position(p2);
            g.setColor(Color.BLUE);
            g.fillOval(xpos, ypos, 35, 35);
        }
        if (p1 == 100) {
            JOptionPane.showMessageDialog(slmain.this, text + " won the game.");
            new Games();
            this.dispose();
        }
        if (p2 == 100) {
            JOptionPane.showMessageDialog(slmain.this, text1 + " won the game.");
            new Games();
            this.dispose();
        }
    }

    public void calc_position(int sc) {
        int a, b;
        a = sc / 10;
        int e = a % 2;
        b = sc % 10;

        if (b == 0) {
            a--;
            a = 10 - a;
            ypos = 68 * a;
        } else {
            a = 10 - a;
            ypos = (68 * a) - 5;
        }
        if (e == 0) {
            if (b == 0) {

                xpos = 96;
            } else {
                xpos = (96 * b);
            }
        } else {
            if (b == 0) {
                xpos = 1050 - 96;
            } else {
                xpos = 1050 - (96 * b);
            }
        }
        return;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            x = r.nextInt(6) + 1;
            if (x == 6) {
                count++;
            }
            if (x == 6 || x == 1) {
                start = true;
            }
            if (start && p1 + x < 101) {
                p1 = p1 + x;
            }
            if (count == 3) {
                p1 = p1 - 18;
            }
            if (x != 6 || count == 3) {
                bt1.setEnabled(false);
                bt1.setBackground(Color.BLACK);
                bt2.setEnabled(true);
                bt2.setBackground(Color.BLUE);
                bt2.setForeground(Color.WHITE);
                count = 0;
            }
            p1 = snl(p1);
            if (p1 == p2) {
                p2 = 0;
            }
            if (p1 == 100) {
                bt1.setEnabled(false);
                bt1.setBackground(Color.BLACK);
                bt2.setEnabled(false);
                bt2.setBackground(Color.BLACK);
            }
            repaint();
        }
        if (ae.getSource() == bt2) {
            x = r.nextInt(6) + 1;
            if (x == 6) {
                count++;
            }
            if (x == 6 || x == 1) {
                start1 = true;
            }
            if (start1 && p2 + x < 101) {
                p2 = p2 + x;
            }
            if (count == 3) {
                p2 = p2 - 18;
            }
            p2 = snl(p2);
            if (x != 6 || count == 3) {
                bt1.setBackground(Color.RED);
                bt1.setForeground(Color.WHITE);
                bt1.setEnabled(true);
                bt2.setEnabled(false);
                bt2.setBackground(Color.BLACK);
                count = 0;
            }
            if (p1 == p2) {
                p1 = 0;
            }
            if (p2 == 100) {
                bt1.setEnabled(false);
                bt1.setBackground(Color.BLACK);
                bt2.setEnabled(false);
                bt2.setBackground(Color.BLACK);
            }
            repaint();
        }
        if (ae.getSource() == bt3) {
            JOptionPane.showMessageDialog(slmain.this, "You are going to play a new game.");
            new slplayers();
            this.dispose();
        }
        if (ae.getSource() == bt4) {
            JOptionPane.showMessageDialog(slmain.this, "You are quiting this game, back to the main menu.");
            new Games();
            this.dispose();
        }
    }

    public static void main(String args[]) {
//        slplayers p1=new slplayers();
//        p1.names();
//        String x=null;
//        String y=null;
        text = args[0];
        text1 = args[1];
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slmain();
            }
        });
    }
}
