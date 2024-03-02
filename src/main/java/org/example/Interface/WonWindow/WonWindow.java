package org.example.Interface.WonWindow;

import javax.swing.*;
import java.awt.*;

public class WonWindow {

    public WonWindow(String wonMessage) {
        JFrame frame = new JFrame();
        frame.setTitle("Tic Tac Toe");
        frame.setSize(500,500);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        ImageIcon icon = new ImageIcon("E:\\javaprojects\\TicTacToe\\src\\main\\resources\\Icon.jpg");
        frame.setIconImage(icon.getImage());
        frame.setResizable(true);
        frame.setVisible(true);

        JLabel label = new JLabel();
        label.setText(wonMessage);
        label.setBackground(new Color(42, 126, 135));
        label.setForeground(new Color(36, 189, 51));
        label.setFont(new Font("Arial", Font.PLAIN, 80));
        label.setVerticalAlignment(JLabel.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);


    }
}
