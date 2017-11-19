package games;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.applet.*;

public class Games extends JFrame implements ActionListener {

    JButton bt1, bt2;
    JLabel lb1, lb2, lb3;
    JMenuBar jmb;
    JMenu jm1, jm2, jm3;
    JMenuItem m1, m2, m3, m4, m5, m6;
    Cursor cr;
    AudioClip click;
    ImageIcon img1, img2;

    Games() {
        setLayout(null);

        cr = new Cursor(Cursor.HAND_CURSOR);
        setCursor(cr);

        getContentPane().setBackground(new Color(155, 205, 135));

        jmb = new JMenuBar();

        jm1 = new JMenu("Sound");
        m1 = new JMenuItem("Sound ON");
        m2 = new JMenuItem("Sound OFF");

        jm2 = new JMenu("Rules");
        m3 = new JMenuItem("Snake & Ladder");
        m4 = new JMenuItem("Number Puzzle");

        jm3 = new JMenu("Help");
        m5 = new JMenuItem("About Us");
        m6 = new JMenuItem("Exit");

        lb1 = new JLabel("2-in-1 Games");
        lb1.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 80));
        lb1.setBounds(380, 80, 700, 100);
        add(lb1);

        img1 = new ImageIcon("C:\\Users\\vinet\\Documents\\NetBeansProjects\\2-in-1\\src\\games\\images\\4.png");
        bt1 = new JButton(img1);
        bt1.setBounds(280, 240, 320, 240);
        add(bt1);

        lb2 = new JLabel("Snake & Ladder");
        lb2.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 40));
        lb2.setBounds(240, 500, 700, 100);
        add(lb2);

        img2 = new ImageIcon("C:\\Users\\vinet\\Documents\\NetBeansProjects\\2-in-1\\src\\games\\images\\images.jpg");
        bt2 = new JButton(img2);
        bt2.setBounds(740, 240, 320, 240);
        add(bt2);

        lb3 = new JLabel("Number Puzzle");
        lb3.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 40));
        lb3.setBounds(720, 500, 700, 100);
        add(lb3);

        //jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);
        //jm1.add(m1);
        jm1.addSeparator();
        //jm1.add(m2);
        jm2.add(m3);
        jm2.addSeparator();
        jm2.add(m4);
        jm3.add(m5);
        jm3.addSeparator();
        jm3.add(m6);

        setJMenuBar(jmb);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        m6.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m5.addActionListener(this);
        m1.addActionListener(this);
        m2.addActionListener(this);

        setVisible(true);
        setTitle("Games");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0, 0);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == m2) {
            m1.setEnabled(true);
            m2.setEnabled(false);
            click.stop();
        } else if (ae.getSource() == m1) {
            m1.setEnabled(false);
            m2.setEnabled(true);
            URL urlClick = Games.class.getResource("Zinda_-_(www.DjRaag.Net).wav");
            click = Applet.newAudioClip(urlClick);
            click.loop();
        } else if (ae.getSource() == bt1) {
            new slentery();
            this.dispose();
        } else if (ae.getSource() == bt2) {
            new puzzlentery();
            this.dispose();
        } else if (ae.getSource() == m6) {
            this.dispose();
        } else if (ae.getSource() == m3) {
            new rulessl();
        } else if (ae.getSource() == m4) {
            new rulesnp();
        } else if (ae.getSource() == m5) {
            new about();
        }
    }

    public static void main(String[] args) {
        Games games = new Games();
    }
}
