package OpenChallange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventManager {
    public static void temperatureConverter(JPanel panel){
        panel.removeAll();
        panel.repaint();
        JLabel lbF = new JLabel("Fahrenheit Scale");
        JLabel lbC = new JLabel("Celsius Scale");
        JTextField txtF = new JTextField();
        JTextField txtC = new JTextField();
        JButton convert = new JButton("CONVERT");
        lbC.setFont(new Font("TimesRoman", Font.PLAIN, 15));
        lbF.setFont(new Font("TimesRoman", Font.PLAIN, 15));
        txtC.setFont(new Font("TimesRoman", Font.BOLD, 15));
        txtF.setFont(new Font("TimesRoman", Font.BOLD, 15));
        convert.setFont(new Font("TimesRoman", Font.BOLD, 15));

        lbF.setForeground(new Color(57, 186, 242, 255));
        lbC.setForeground(new Color(57, 186, 242, 255));

        txtC.setForeground(new Color(5, 111, 146, 255));
        txtF.setForeground(new Color(5, 111, 146, 255));
        txtC.setBackground(new Color(255, 255, 255, 255));
        txtF.setBackground(new Color(255, 255, 255, 255));
        convert.setBackground(new Color(1, 176, 174, 255));
        convert.setForeground(new Color(14, 57, 197, 255));

        lbF.setBounds(panel.getX()+10,panel.getY()+10,120,30);
        txtF.setBounds(lbF.getX()+ lbF.getWidth()+ 5,lbF.getY(),100,30);
        lbC.setBounds(panel.getX()+10,txtF.getY()+txtF.getHeight()+10,120,30);
        txtC.setBounds(lbC.getX()+lbC.getWidth()+5,lbC.getY(),100,30);
        convert.setBounds(lbC.getX()+70,txtC.getY()+txtC.getHeight()+5,130,30);

        panel.add(lbF);
        panel.add(lbC);
        panel.add(txtF);
        panel.add(txtC);
        panel.add(convert);

        txtF.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                txtF.setText("");
                txtC.setText("");
            }
        });
        txtC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                txtF.setText("");
                txtC.setText("");
            }
        });
        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtF.getText().isEmpty()){
                    double c = Double.parseDouble(txtC.getText());
                    if(Double.isNaN(c)){
                        txtF.setText("Invalid");
                    }
                    else{
                        c = 1.8*c+32;
                        txtF.setText(String.format("%.2f",c));
                    }
                }
                else if(txtC.getText().isEmpty()){
                    double f = Double.parseDouble(txtF.getText());
                    if(Double.isNaN(f)){
                        txtC.setText("Invalid");
                    }
                    else{
                        f = (5*f-160)/9;
                        txtC.setText(String.format("%.2f",f));
                    }
                }

            }
        });
    }

    public static void standardCalculator(JPanel panel) {
        panel.removeAll();
        panel.repaint();
        JTextField input = new JTextField();
        input.setBackground(new Color(43, 41, 42));
        input.setForeground(new Color(253, 253, 253));
        JLabel output = new JLabel("Result: ");
        output.setBackground(new Color(32, 37, 46));
        output.setForeground(new Color(2, 216, 214));
        Font fnt = new Font("TimesRoman", Font.BOLD, 20);
        input.setFont(fnt);
        output.setFont(new Font("TimesRoman", Font.BOLD, 15));
        panel.add(input);
        panel.add(output);


        JButton []numberButtons = new JButton[10];
        for(int i = 0; i < 10; i++){
            numberButtons[i]= new JButton(String.valueOf(i));
            numberButtons[i].setFont(fnt);
            numberButtons[i].setBackground(new Color(52, 52, 52));
            numberButtons[i].setForeground(new Color(195, 215, 239));
            panel.add(numberButtons[i]);
        }

        JButton plus = new JButton(new ImageIcon("CustomResources/plus.png"));
        JButton minus = new JButton(new ImageIcon("CustomResources/minus.png"));
        JButton mul = new JButton(new ImageIcon("CustomResources/multiply.png"));
        JButton div = new JButton(new ImageIcon("CustomResources/div.png"));
        JButton reset = new JButton(new ImageIcon("CustomResources/reset.png"));
        JButton dot = new JButton(new ImageIcon("CustomResources/dot.png"));
        JButton equal = new JButton(new ImageIcon("CustomResources/equal.png"));
        ActionListener e = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == reset){
                    input.setText("");
                    output.setText("Result: ");
                } else if (e.getSource() == dot) {
                    input.setText(input.getText()+".");
                } else if(e.getSource() == equal){
                    try {
                        double result = ExpressionEvaluator.evaluate(input.getText());
                        output.setText("Result: " + String.format("%.2f", result));
                    }catch (Exception exception){
                            output.setText("Result: Invalid Operation");
                    }

                } else if (e.getSource() == plus) {
                    input.setText(input.getText() + "+");
                } else if (e.getSource() == minus) {
                    input.setText(input.getText() + "-");
                } else if (e.getSource() == mul) {
                    input.setText(input.getText() + "*");
                } else if (e.getSource() == div) {
                    input.setText(input.getText() + "/");
                } else{
                    for(int i = 0; i < 10; i++){
                        if (e.getSource() == numberButtons[i]){
                            input.setText(input.getText()+String.valueOf(i));
                        }
                    }

                }

            }
        };

        for(int i = 0; i < 10; i++){
            numberButtons[i].addActionListener(e);
        }
        plus.addActionListener(e);
        minus.addActionListener(e);
        mul.addActionListener(e);
        div.addActionListener(e);
        dot.addActionListener(e);
        equal.addActionListener(e);
        reset.addActionListener(e);

        panel.add(plus);
        panel.add(minus);
        panel.add(mul);
        panel.add(div);
        panel.add(reset);
        panel.add(dot);
        panel.add(equal);



        int sqrButton = 60;
        int padding = 66;

        input.setBounds(5,5,panel.getWidth()-10, sqrButton);
        output.setBounds(5,input.getY()+padding,panel.getWidth()-85,sqrButton);
        reset.setBounds(output.getX()+output.getWidth()+15,output.getY(), sqrButton, sqrButton);

        numberButtons[7].setBounds(input.getX(),output.getY()+padding, sqrButton, sqrButton);
        numberButtons[8].setBounds(numberButtons[7].getX()+padding,output.getY()+padding, sqrButton, sqrButton);
        numberButtons[9].setBounds(numberButtons[8].getX()+padding,output.getY()+padding, sqrButton, sqrButton);
        div.setBounds(numberButtons[9].getX()+padding,output.getY()+padding, sqrButton, sqrButton);

        numberButtons[4].setBounds(input.getX(),div.getY()+padding, sqrButton, sqrButton);
        numberButtons[5].setBounds(numberButtons[4].getX()+padding,div.getY()+padding, sqrButton, sqrButton);
        numberButtons[6].setBounds(numberButtons[5].getX()+padding,div.getY()+padding, sqrButton, sqrButton);
        mul.setBounds(numberButtons[6].getX()+padding,div.getY()+padding, sqrButton, sqrButton);

        numberButtons[1].setBounds(input.getX(),mul.getY()+padding, sqrButton, sqrButton);
        numberButtons[2].setBounds(numberButtons[1].getX()+padding,mul.getY()+padding, sqrButton, sqrButton);
        numberButtons[3].setBounds(numberButtons[2].getX()+padding,mul.getY()+padding, sqrButton, sqrButton);
        minus.setBounds(numberButtons[3].getX()+padding,mul.getY()+padding, sqrButton, sqrButton);

        dot.setBounds(input.getX(),minus.getY()+padding, sqrButton, sqrButton);
        numberButtons[0].setBounds(dot.getX()+padding,minus.getY()+padding, sqrButton, sqrButton);
        equal.setBounds(numberButtons[0].getX()+padding,minus.getY()+padding, sqrButton, sqrButton);
        plus.setBounds(equal.getX()+padding,minus.getY()+padding, sqrButton, sqrButton);


    }

    public static void bMICalculator(JPanel panel) {

    }
    public static void distanceConverter(JPanel panel) {

    }
}
