package Problem09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TemperatureConv {
    private Container c;
    TemperatureConv(){
        JFrame f = new JFrame("Temperature Converter");
        JLabel lbF = new JLabel("Temperature in Ferhenheit");
        JLabel lbC = new JLabel("Temperature in Celsius");
        JTextField txtF = new JTextField();
        JTextField txtC = new JTextField();
        JButton convert = new JButton("Convert");

        f.setBounds(0,0,400,300);

        lbF.setBounds(f.getX()+10,f.getY()+10,150,20);
        txtF.setBounds(lbF.getX()+ lbF.getWidth() + 5,lbF.getY(),100,20);

        lbC.setBounds(f.getX()+10,txtF.getY()+txtF.getHeight()+10,150,20);
        txtC.setBounds(lbC.getX()+lbC.getWidth()+5,lbC.getY(),100,20);
        convert.setBounds(lbC.getX()+70,txtC.getY()+txtC.getHeight()+5,100,20);

        f.add(lbF);
        f.add(lbC);
        f.add(txtF);
        f.add(txtC);
        f.add(convert);
        f.setLayout(null);

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
                    Double c = Double.valueOf(txtC.getText());
                    if(c.isNaN()){
                        txtF.setText("Invalid");
                    }
                    else{
                        c = 1.8*c+32;
                        txtF.setText(String.format("%.2f",c));
                    }
                }
                else if(txtC.getText().isEmpty()){
                    Double f = Double.valueOf(txtF.getText());
                    if(f.isNaN()){
                        txtC.setText("Invalid");
                    }
                    else{
                        f = (5*f-160)/9;
                        txtC.setText(String.format("%.2f",f));
                    }
                }

            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TemperatureConv();
    }

}
