package Problem05;

import Problem07.BackgroundColor;

import javax.swing.*;
import java.awt.*;

public class MyGUI {
    MyGUI(){
        JFrame f = new JFrame("MY FRAME");
        JLabel radioLb = new JLabel("Radio Buttons"), checkBox = new JLabel("Check Boxes");
        JRadioButton sl4 = new JRadioButton("4 Slice"), sl8 = new JRadioButton("8 Slice");
        JCheckBox anch = new JCheckBox("Anchovies"), garlic = new JCheckBox("Garlic");
        String []animal={"Bird","Cat","Dog","Rabbit","Cow"};
        JComboBox cb=new JComboBox(animal);
        JPanel p = new JPanel();
        JPanel q = new JPanel();
        f.setBounds(10,10,720,540);

        p.add(radioLb);
        p.add(sl4);
        p.add(sl8);

        q.add(checkBox);
        q.add(anch);
        q.add(garlic);
        q.add(cb);

        f.add(p);
        f.add(q);

        GridLayout lp = new GridLayout(3,1);
        lp.setVgap(100);
        p.setLayout(lp);
        GridLayout lq = new GridLayout(4,1);
        lq.setVgap(100);
        q.setLayout(lq);
        GridLayout layout = new GridLayout(1,2);
        layout.setHgap(200);
        f.setLayout(layout);

        System.out.println(radioLb.getX());
        System.out.println(radioLb.getVerticalAlignment());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}
