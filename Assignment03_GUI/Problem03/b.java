package Problem03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class b {
    b(String layout){
        Frame f = new Frame("My Frame With " + layout);
        Label lb = new Label("Label");
        Button btn = new Button("Send");
        TextField txt = new TextField("Text");

        f.add(lb);
        f.add(txt);
        f.add(btn);
        f.setVisible(true);
        switch (layout){
            default: {
                f.setLayout(null);
                f.setBounds(50,350,300, 200);
                break;
            }
            case "Flow Layout" : {
                f.setLayout(new FlowLayout());
                f.setBounds(400,350,300, 200);
                break;
            }
            case "Border Layout" : {
                f.setLayout(new BorderLayout());
                f.setBounds(750,350,300, 200);
                break;
            }
            case "Grid Layout" : {
                f.setLayout(new GridLayout());
                f.setBounds(1100,350,300, 200);
                break;
            }
        }
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                f.dispose();
            }
        });
    }
    public static void main(String[] args) {
        new b("Default");
        new b("Flow Layout");
        new b("Border Layout");
        new b("Grid Layout");
    }
}
