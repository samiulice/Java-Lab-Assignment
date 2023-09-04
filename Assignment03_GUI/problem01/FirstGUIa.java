package problem01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstGUIa {
    FirstGUIa(){
        Frame f = new Frame("My First GUI Frame");
        f.setBounds(400,300,600,450);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                f.dispose();
            }
        });
    }

    public static void main(String... args) {
        new FirstGUIa();
    }

}
