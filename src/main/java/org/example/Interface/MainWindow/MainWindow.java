package org.example.Interface.MainWindow;


import org.example.Interface.PlayWindow.PlayWindow;
import org.w3c.dom.css.RGBColor;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class MainWindow implements ActionListener {

    JButton play;


    public MainWindow() {


        JFrame frame = new JFrame();
        frame.setTitle("Tic Tac Toe");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth()) / 4);
        int y = (int) ((dimension.getHeight()) / 4);
        frame.setLocation(x, y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("src/main/resources/Icon.jpg");
        frame.setIconImage(icon.getImage());
        frame.setResizable(true);
        frame.setVisible(true);


        JLabel label = new JLabel();
        ImageIcon backImage = new ImageIcon("src/main/resources/1.jpg");
        label.setIcon(backImage);


        play = new JButton();
        play.setText("Play!");
        play.setFont(new Font("Arial", Font.PLAIN, 40));
        play.setForeground(Color.GREEN);
        play.setBackground(new Color(98, 29, 130));
        play.setBounds(410,354,202,65);
        play.addActionListener(this);
        label.add(play);

        frame.add(label);


        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==play){
            PlayWindow playWindow = new PlayWindow();
            System.out.println("Go to Play Window!");
        }
    }
}
