package Problem02;

import javax.swing.*;
public class Master {
    Master(){
        JFrame frame = new JFrame("Click to close Everything");
        frame.setBounds(400, 300,400,300);
        frame.setVisible(true);
        new Child();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Master();
    }
}
