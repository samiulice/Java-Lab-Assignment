package problem01;

import javax.swing.*;
import java.awt.*;

public class FirstGUIb {
    FirstGUIb(){
        JFrame f = new JFrame("My First GUI Frame");
        f.setBounds(400,300,800,600);
        f.setVisible(true);
    }
    public static void main(String[] args){
        FirstGUIb f = new FirstGUIb();
    }
}
