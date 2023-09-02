package Problem01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class test {
    test(){
        Frame fm = new Frame("Simple Calculator");
        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("x");
        Button div = new Button("/");
        Button equal = new Button("=");
        Label inputLb = new Label("Input:");
        TextField inputTxt = new TextField();
        Label outputLb = new Label("Result:");
        TextField outputTxt = new TextField();


        add.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        sub.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        mul.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        div.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        equal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        inputLb.setFont(new Font("Times New Roman", Font.BOLD, 15));
        inputTxt.setFont(new Font("Times New Roman", Font.BOLD, 15));
        outputLb.setFont(new Font("Times New Roman", Font.BOLD, 15));
        outputTxt.setFont(new Font("Times New Roman", Font.BOLD, 15));
        fm.setBounds(400,300,400,200);
        add.setBounds(30,60,40,40);
        sub.setBounds(80,60,40,40);
        mul.setBounds(30,110,40,40);
        div.setBounds(80,110,40,40);

        inputLb.setBounds(130,55,50,30);
        inputTxt.setBounds(185,55,180,30);
        equal.setBounds(260,90,35,30);
        outputLb.setBounds(130,130,50,30);
        outputTxt.setBounds(185,130,180,30);



        fm.add(add);
        fm.add(sub);
        fm.add(mul);
        fm.add(div);
        fm.add(equal);
        fm.add(inputLb);
        fm.add(inputTxt);
        fm.add(equal);
        fm.add(outputLb);
        fm.add(outputTxt);
        fm.setResizable(false);
        fm.setLayout(new BorderLayout());
        fm.setVisible(true);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
        new test();
    }
}
