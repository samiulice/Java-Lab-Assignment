package Problem03;

import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.*;

public class a {
    a(String layout){
        JFrame f = new JFrame("My Frame With " + layout);
        JLabel lb = new JLabel("Label");
        JButton btn = new JButton("Send");
        JTextField txt = new JTextField("Text");

        f.add(lb);
        f.add(txt);
        f.add(btn);
        f.setVisible(true);
        switch (layout){
            default: {
                f.setLayout(null);
                f.setBounds(50,100,300, 200);
                break;
            }
            case "Flow Layout" : {
                f.setLayout(new FlowLayout());
                f.setBounds(400,100,300, 200);
                break;
            }
            case "Border Layout" : {
                f.setLayout(new BorderLayout());
                f.setBounds(750,100,300, 200);
                break;
            }
            case "Grid Layout" : {
                f.setLayout(new GridLayout());
                f.setBounds(1100,100,300, 200);
                break;
            }
        }
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new a("Default");
        new a("Flow Layout");
        new a("Border Layout");
        new a("Grid Layout");
    }
}
