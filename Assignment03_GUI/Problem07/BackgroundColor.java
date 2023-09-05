package Problem07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackgroundColor {
    BackgroundColor(){
        JFrame f = new JFrame("Background Color");
        JButton red = new JButton("Red");
        JButton green = new JButton("Green");
        Font font = new Font("TimesRoman", Font.BOLD, 15);
        red.setFont(font);
        green.setFont(font);

        f.setSize(1024,720);
        f.getContentPane().setBackground(Color.darkGray);
        f.add(red);
        f.add(green);
        f.setLayout(new FlowLayout());

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.getContentPane().setBackground(Color.RED);
            }
        });
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.getContentPane().setBackground(Color.green);
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new BackgroundColor();
    }

}
