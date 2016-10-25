package ru.GUI;

import ru.Util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;

/**
 * Created by Иннокентий on 22.10.2016.
 */
public class Node extends JComponent {

    static int idCount=0;
    int id, positionX, positionY;
     List<JButton> inputs;

    double output,input;
    int inputsAmount;
    JTextArea formula;

    public Node(int x, int y, int inputsAmount, String formula){
        setDoubleBuffered(false);
        setLayout(null);
        inputs = new ArrayList<>();
        this.inputsAmount=inputsAmount;
        this.formula = new JTextArea(formula);
        this.formula.setLocation(51,51);

        setOpaque(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Block");
            }
        });

        setBounds(x-100,y-50, 200,100);
        id=idCount++;
        this.formula.setText( String.valueOf(this.id));
//        inputs = new ArrayList<>();
        output=formula(input,5);
    }
    public double formula(double input, double coeffency){
        return 0;
    }
    public void details(){

    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(0,0,20,99);
        for (int i = 0; i < inputsAmount; i++) {

            inputs.add(new JButton());
            inputs.get(i).setSize(6,6);
            inputs.get(i).setLocation(1, (i + 1) * (100 / inputsAmount)     -    (100/inputsAmount)/2  - 3);
            this.add(inputs.get(i));
            g.drawLine(1,(int)Math.round(100/inputsAmount)*(1+i),19,(int)Math.round(100/inputsAmount)*(1+i));
        }
        formula.setBounds(26,40,150,20);
        this.add(formula);
        g.drawRect(0,0,199,99);
        g.drawLine(181,1,181,99);


    }


}
