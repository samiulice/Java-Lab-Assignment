package Problem06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounter {
    int i = 0;
    ClickCounter(){
        JFrame frame = new JFrame("Click Counter");
        JButton button = new JButton("OK");
        Font font = new Font("TimesRoman", Font.BOLD, 15);
        JTextField txt = new JTextField("Hello Click java " + i);
        button.setFont(font);
        txt.setFont(font);


        frame.setBounds(10,10,400,300);
        button.setBounds(frame.getX(),frame.getY(),70,40);
        txt.setBounds(button.getX()+button.getWidth()+5,button.getY(),160,40);

        frame.add(txt);
        frame.add(button);
        frame.setLayout(null);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i = i + 1;
                txt.setText("Hello Click java " + i);
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new ClickCounter();
    }
}
