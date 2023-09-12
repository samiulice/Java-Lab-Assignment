package OpenChallange;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    Calculator(){
        JFrame f = new JFrame("Calculator");
        JPanel panel = new JPanel();
        JMenuBar mb = new JMenuBar();
        JMenu st = new JMenu("Calculator");
        JMenu cnv = new JMenu("Converter");
        JMenuItem st1 = new JMenuItem("Standard");
        JMenuItem st2 = new JMenuItem("BMI");
        JMenuItem cnv1 = new JMenuItem("Temperature Converter");
        JMenuItem cnv2 = new JMenuItem("Distance Converter");

        f.getContentPane().setBackground(new Color(33, 33, 34));
        panel.setBackground(new Color(0, 0, 0, 255));
        mb.setBackground(new Color(25, 57, 70, 255));
        st.setForeground(new Color(171, 248, 159, 255));
        cnv.setForeground(new Color(171, 248, 159, 255));
        st.setFont(new Font("TimesRoman", Font.BOLD, 15));
        cnv.setFont(new Font("TimesRoman", Font.BOLD, 15));


        mb.setLayout(null);
        panel.setLayout(null);
        f.setLayout(null);
        f.setBounds(100,100,285,480);
        mb.setBounds(0,0,f.getWidth()-15,30);
        st.setBounds(0,0,mb.getWidth()/2,25);
        cnv.setBounds(mb.getWidth()/2,0,mb.getWidth()/2,25);
        panel.setBounds(mb.getX(),mb.getY()+mb.getHeight()+5,mb.getWidth(),f.getHeight()-mb.getHeight()-55);

        Border blackLine = BorderFactory.createLineBorder(Color.black);
        panel.setBorder(blackLine);
        mb.setBorder(blackLine);

        st.add(st1);
        st.add(st2);
        cnv.add(cnv1);
        cnv.add(cnv2);
        mb.add(st);
        mb.add(cnv);
        EventManager.standardCalculator(panel);
        f.add(mb);
        f.add(panel);

        ActionListener e = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (st1 == e.getSource()) {
                    EventManager.standardCalculator(panel);
                } else if (st2 == e.getSource()) {
                    EventManager.bMICalculator(panel);
                } else if (cnv1 == e.getSource()) {
                    EventManager.temperatureConverter(panel);
                }else if (cnv2 == e.getSource()) {
                    EventManager.distanceConverter(panel);
                }
            }
        };
        st1.addActionListener(e);
        st2.addActionListener(e);
        cnv1.addActionListener(e);
        cnv2.addActionListener(e);

        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
