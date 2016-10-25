package ru.GUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

/**
 * Component for drawing !
 *
 * @author sylsau
 *
 */
public class DrawArea extends JFrame {

    // Mouse coordinates
    private int currentX, currentY;
    JPanel panel, tools;
    JTextField inputsField , formulaField;
    JLabel inputsLabel, formulaLabel;
    public DrawArea() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600,800);
        setLayout(new BorderLayout());
        tools = new JPanel();
        tools.setSize(600,200);
        tools.setBackground(Color.lightGray);
        GridBagConstraints gbc = new GridBagConstraints();
        tools.setLayout(new GridBagLayout());
        gbc.gridx=0;gbc.gridy=0;
        inputsLabel = new JLabel("Amount of inputs: ");
        tools.add(inputsLabel,gbc);
        gbc.gridx=1;gbc.gridy=0;
        inputsField = new JTextField(1);
        tools.add(inputsField,gbc);
        gbc.gridx=0;gbc.gridy=1;
        formulaLabel= new JLabel("Coeffency: ");
        tools.add(formulaLabel,gbc);
        gbc.gridx=1;gbc.gridy=1;
        formulaField = new JTextField(3);
        tools.add(formulaField,gbc);

        add(tools,BorderLayout.NORTH);
        panel = new JPanel();
        panel.setSize(6000,6000);
        panel.setLayout(null);
        final JScrollPane scrollPane = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);




        add(scrollPane,BorderLayout.CENTER);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Node bufferNode = new Node(e.getX(),e.getY(),Integer.parseInt(inputsField.getText()),formulaField.getText());
                panel.add(bufferNode);
                panel.repaint();
            }
        });
        setVisible(true);
    }



}