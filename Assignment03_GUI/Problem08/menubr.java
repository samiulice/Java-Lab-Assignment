package Problem08;

import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class menubr {
    menubr(){
        JFrame f = new JFrame("My Frame");
        JLabel disp = new JLabel();
        disp.setFont(new Font("TimesRoman", Font.BOLD, 25));
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Indian States");
        JMenu menu2 = new JMenu("Indian Cities");
        String []statesName = {"Himachal Pradesh","Rajasthan","West Bengal","Andhra Pradesh","Tamilnadu","Karnataka"};
        String []citiesName = {"Delhi","Bengaluru","Hyderabad","Lucknow","Ahmedabad","Chennai"};
        JMenuItem []states = new JMenuItem[6];
        JMenuItem []cities = new JMenuItem[6];
        for(int i = 0; i < 6; i++){
            states[i] = (new JMenuItem(statesName[i]));
            cities[i] = (new JMenuItem(citiesName[i]));
            menu1.add(states[i]);
            menu2.add(cities[i]);
            int finalI = i;
            states[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    disp.setText(statesName[finalI]);
                }
            });
            cities[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    disp.setText(citiesName[finalI]);
                }
            });
        }

        menuBar.add(menu1);
        menuBar.add(menu2);
        f.setJMenuBar(menuBar);
        f.setBounds(10,10,720,540);
        disp.setBounds(f.getX()+250,f.getY()+300,300,50);
        f.setLayout(null);
        f.add(disp);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new menubr();
    }
}
