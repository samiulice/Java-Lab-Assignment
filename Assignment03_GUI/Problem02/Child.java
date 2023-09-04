package Problem02;

import javax.swing.*;

public class Child {
    Child(){
        JFrame f = new JFrame("Click to close this frame only");
        f.setBounds(600,450,300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
