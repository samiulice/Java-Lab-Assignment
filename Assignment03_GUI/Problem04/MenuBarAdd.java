package Problem04;

import javax.swing.*;

public class MenuBarAdd {
    MenuBarAdd(){
        JFrame f = new JFrame("My Frame");
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");
        JMenuBar menuBar = new JMenuBar();
        JMenuItem f1,f2,f3,f4,f5,h1,h2,h3;
        f1 = new JMenuItem("New");
        f2 = new JMenuItem("Open");
        f3 = new JMenuItem("Save");
        f4 = new JMenuItem("Save as");
        f5 = new JMenuItem("Exit");
        h1 = new JMenuItem("Check Updates");
        h2 = new JMenuItem("FAQ");
        h3 = new JMenuItem("About");

        file.add(f1);
        file.add(f2);
        file.add(f3);
        file.add(f4);
        file.add(f5);
        help.add(h1);
        help.add(h2);
        help.add(h3);
        menuBar.add(file);
        menuBar.add(new JMenu("View"));
        menuBar.add(help);
        f.setJMenuBar(menuBar);
        f.setSize(720,480);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuBarAdd();
    }
}
