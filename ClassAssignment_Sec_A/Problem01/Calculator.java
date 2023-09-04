package Problem01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator {
    private int sign;
    private Double[] num = new Double[2];

    Calculator(){
        Frame fm = new Frame("Simple Calculator");
        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("x");
        Button div = new Button("/");
        Button equal = new Button("=");
        Button clr = new Button("Clear");
        Label inputLb = new Label("Input");
        TextField inputTxt = new TextField();
        Label outputLb = new Label("Result");
        TextField outputTxt = new TextField();


        Font fontA = new Font("TimesRoman", Font.BOLD, 25);
        Font fontB = new Font("TimesRoman", Font.BOLD, 15);
        add.setFont(fontA);
        sub.setFont(fontA);
        mul.setFont(fontA);
        div.setFont(fontA);
        equal.setFont(fontA);
        clr.setFont(fontB);
        inputLb.setFont(fontB);
        inputTxt.setFont(fontB);
        outputLb.setFont(fontB);
        outputTxt.setFont(fontB);
        fm.setBounds(400,300,480,200);
        add.setBounds(30,60,40,40);
        sub.setBounds(80,60,40,40);
        mul.setBounds(30,110,40,40);
        div.setBounds(80,110,40,40);

        inputLb.setBounds(150,55,50,30);
        inputTxt.setBounds(210,55,180,30);
        equal.setBounds(240,90,35,30);
        clr.setBounds(300,90,50,30);
        outputLb.setBounds(150,130,50,30);
        outputTxt.setBounds(210,130,180,30);



        fm.add(add);
        fm.add(sub);
        fm.add(mul);
        fm.add(div);
        fm.add(equal);
        fm.add(clr);
        fm.add(inputLb);
        fm.add(inputTxt);
        fm.add(outputLb);
        fm.add(outputTxt);
        fm.setResizable(false);
        fm.setLayout(new BorderLayout());
        fm.setVisible(true);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sign = 1;
                setTxt(inputTxt, outputTxt, "+");
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sign = 2;
                setTxt(inputTxt, outputTxt, "-");
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sign = 3;
                setTxt(inputTxt, outputTxt, "x");
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sign = 4;
                setTxt(inputTxt, outputTxt, " / ");
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputTxt.setText("");
                outputTxt.setText("");
                sign = 0;
                num[0] = 0.0;
                num[1] = 0.0;
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = 0;
                String txt = inputTxt.getText(), temp = "";
                for(int i = 0; i < txt.length() && index < 2; i++){
                    char c = txt.charAt(i);
                    if(c == '+' || c == '-' || c == 'x' || c == '/'){
                        num[index++] = Double.valueOf(temp);
                        temp = "";
                    }
                    else if((c >= '0' && c <= '9') || c == '.'){
                        temp += String.valueOf(c);
                    }
                }
                num[index] = Double.valueOf(temp);
                if (sign == 1){
                    outputTxt.setText(String.valueOf((num[0]+num[1])));
                }
                else if (sign == 2){
                    outputTxt.setText(String.valueOf((num[0]-num[1])));
                }
                else if (sign == 3){
                    outputTxt.setText(String.valueOf((num[0]*num[1])));
                }
                else if (sign == 4){
                    if(num[1] == 0) {
                        outputTxt.setText("Invalid");
                    }
                    else {
                        outputTxt.setText(String.valueOf(( num[0] / num[1])));
                    }
                }

                //
                sign = 0;
                num[0] = 0.0;
                num[1] = 0.0;

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

    private void setTxt(TextField inputTxt, TextField outputTxt, String str){
        if(!outputTxt.getText().isEmpty()){
            inputTxt.setText(outputTxt.getText() + str);
        }
        else {
            inputTxt.setText(inputTxt.getText() +str);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
