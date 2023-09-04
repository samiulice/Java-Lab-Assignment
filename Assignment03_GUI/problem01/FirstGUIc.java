package problem01;

import javax.swing.*;
public class FirstGUIc extends JFrame {
    FirstGUIc(){
        setTitle("My First GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,300,400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FirstGUIc();
    }

}
