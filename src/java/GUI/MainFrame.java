package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Innokentiy on 23.10.2016.
 */
public class MainFrame extends JFrame {
    JPanel panel;
    public MainFrame() {
        setSize(new Dimension(600, 600));

        panel = new JPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.gray);
        add(panel);


        setVisible(true);
    }

}
