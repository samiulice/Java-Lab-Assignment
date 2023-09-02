package Problem02;

import java.awt.*;
import java.awt.event.*;
import java.util.Stack;
public class SimpleTextEditor {
    Stack<String> txtHistory = new Stack<>();
    SimpleTextEditor() {
        Frame fm = new Frame("Simple Text Editor");
        Label lb = new Label("Input");
        TextField txt = new TextField();
        Button undo = new Button("Undo");
        Button clr = new Button("Clear");

        //Position of components
        fm.setBounds(400,300,600,200);
        lb.setBounds(20,80,40,30);
        txt.setBounds(65,80,300,30);
        undo.setBounds(370,80,80,30);
        clr.setBounds(455,80,80,30);
        lb.setFont(new Font("TimesRoman", Font.BOLD, 14));
        txt.setFont(new Font("TimesRoman", Font.BOLD, 14));
        undo.setFont(new Font("TimesRoman", Font.BOLD, 14));
        clr.setFont(new Font("TimesRoman", Font.BOLD, 14));
        fm.add(lb);
        fm.add(txt);
        fm.add(undo);
        fm.add(clr);
        fm.setLayout(new BorderLayout());
        fm.setVisible(true);

        txt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                txtHistory.push(txt.getText());
            }
        });

        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtHistory.isEmpty()){
                    txt.setText(txtHistory.pop());
                }
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("");
                txtHistory.empty();
            }
        });
        fm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SimpleTextEditor txtEditor = new SimpleTextEditor();
        System.out.println(txtEditor);
    }

}