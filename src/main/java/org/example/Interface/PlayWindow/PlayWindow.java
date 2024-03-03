package org.example.Interface.PlayWindow;

import org.example.Interface.WonWindow.WonWindow;
import org.example.Logic.Logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayWindow implements ActionListener {
    Logic logic;

    JLabel select = new JLabel();
    JLabel B1 = new JLabel();
    JLabel B2 = new JLabel();
    JLabel B3 = new JLabel();
    JLabel B4 = new JLabel();
    JLabel B5 = new JLabel();
    JLabel B6 = new JLabel();
    JLabel B7 = new JLabel();
    JLabel B8 = new JLabel();
    JLabel B9 = new JLabel();

    ImageIcon SelectXImage = new ImageIcon("src/main/resources/XButtons/SelectX.png");
    ImageIcon SelectOImage = new ImageIcon("src/main/resources/OButtons/SelectO.png");



    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    String ReturnMessage = "";


    public PlayWindow() {
        logic = new Logic();

        //Main PlayWindow Frame
        JFrame playFrame = new JFrame();
        playFrame.setTitle("Tic Tac Toe");
        playFrame.setSize(465,630);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - playFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - playFrame.getHeight()) / 2);
        playFrame.setLocation(x, y);
        ImageIcon icon = new ImageIcon("src/main/resources/Icon.jpg");
        playFrame.setIconImage(icon.getImage());
        playFrame.setResizable(true);
        playFrame.setVisible(true);

        //Background image label
        JLabel label = new JLabel();
        ImageIcon backImage = new ImageIcon("src/main/resources/prison.png");
        label.setIcon(backImage);



        //Select label image
        select.setIcon(SelectXImage);
        select.setSize(465,143);
        select.setLocation(0,0);
        select.setText("X");

        //Buttons Label
        JLabel rectangle = new JLabel();
        rectangle.setSize(400,395);
        rectangle.setLayout(new GridLayout(3,3,20,15));

        //Buttons
        button1 = new JButton();
        button1.setOpaque(false);
        button1.setContentAreaFilled(false);
        button1.setBorderPainted(false);
        button1.setVisible(true);
        button1.addActionListener(this);
        rectangle.add(button1);
        B1.setBounds(25,171,125,121);
        B1.setVisible(false);
        playFrame.add(B1);
        button2 = new JButton();
        button2.setOpaque(false);
        button2.setContentAreaFilled(false);
        button2.setBorderPainted(false);
        button2.setVisible(true);
        button2.addActionListener(this);
        rectangle.add(button2);
        B2.setBounds(165,171,125,121);
        B2.setVisible(false);
        playFrame.add(B2);
        button3 = new JButton();
        button3.setOpaque(false);
        button3.setContentAreaFilled(false);
        button3.setBorderPainted(false);
        button3.setVisible(true);
        button3.addActionListener(this);
        rectangle.add(button3);
        B3.setBounds(305,171,125,121);
        B3.setVisible(false);
        playFrame.add(B3);
        button4 = new JButton();
        button4.setOpaque(false);
        button4.setContentAreaFilled(false);
        button4.setBorderPainted(false);
        button4.setVisible(true);
        button4.addActionListener(this);
        rectangle.add(button4);
        B4.setBounds(25,305,125,121);
        B4.setVisible(false);
        playFrame.add(B4);
        button5 = new JButton();
        button5.setOpaque(false);
        button5.setContentAreaFilled(false);
        button5.setBorderPainted(false);
        button5.setVisible(true);
        button5.addActionListener(this);
        rectangle.add(button5);
        B5.setBounds(165,305,125,121);
        B5.setVisible(false);
        playFrame.add(B5);
        button6 = new JButton();
        button6.setOpaque(false);
        button6.setContentAreaFilled(false);
        button6.setBorderPainted(false);
        button6.setVisible(true);
        button6.addActionListener(this);
        rectangle.add(button6);
        B6.setBounds(305,305,125,121);
        B6.setVisible(false);
        playFrame.add(B6);
        button7 = new JButton();
        button7.setOpaque(false);
        button7.setContentAreaFilled(false);
        button7.setBorderPainted(false);
        button7.setVisible(true);
        button7.addActionListener(this);
        rectangle.add(button7);
        B7.setBounds(25,445,125,121);
        B7.setVisible(false);
        playFrame.add(B7);
        button8 = new JButton();
        button8.setOpaque(false);
        button8.setContentAreaFilled(false);
        button8.setBorderPainted(false);
        button8.setVisible(true);
        button8.addActionListener(this);
        rectangle.add(button8);
        B8.setBounds(165,445,125,121);
        B8.setVisible(false);
        playFrame.add(B8);
        button9 = new JButton();
        button9.setOpaque(false);
        button9.setContentAreaFilled(false);
        button9.setBorderPainted(false);
        button9.setVisible(true);
        button9.addActionListener(this);
        rectangle.add(button9);
        B9.setBounds(305,445,125,121);
        B9.setVisible(false);
        playFrame.add(B9);



        //Add part
        rectangle.setLocation(25,170);
        label.add(rectangle);
        playFrame.add(select);
        playFrame.add(label);

        
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(select.getText().equals("X")) {
            if (actionEvent.getSource() == button1) {
                ImageIcon icon = new ImageIcon("src/main/resources/XButtons/X1.png");
                B1.setIcon(icon);
                B1.setVisible(true);

                select.setIcon(SelectOImage);
                select.setText("O");

                button1.setEnabled(false);

                ReturnMessage = logic.logic(0,0,1);

                if(ReturnMessage.equals("X Won!")){
                    WonWindow wonWindow = new WonWindow("X Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button2) {
                ImageIcon icon = new ImageIcon("src/main/resources/XButtons/X2.png");
                B2.setIcon(icon);
                B2.setVisible(true);

                select.setIcon(SelectOImage);
                select.setText("O");

                button2.setEnabled(false);

                ReturnMessage = logic.logic(0,1,1);

                if(ReturnMessage.equals("X Won!")){
                    WonWindow wonWindow = new WonWindow("X Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button3) {
                ImageIcon icon = new ImageIcon("src/main/resources/XButtons/X3.png");
                B3.setIcon(icon);
                B3.setVisible(true);

                select.setIcon(SelectOImage);
                select.setText("O");

                button3.setEnabled(false);

                ReturnMessage = logic.logic(0,2,1);

                if(ReturnMessage.equals("X Won!")){
                    WonWindow wonWindow = new WonWindow("X Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button4) {
                ImageIcon icon = new ImageIcon("src/main/resources/XButtons/X4.png");
                B4.setIcon(icon);
                B4.setVisible(true);

                select.setIcon(SelectOImage);
                select.setText("O");

                button4.setEnabled(false);

                ReturnMessage = logic.logic(1,0,1);

                if(ReturnMessage.equals("X Won!")){
                    WonWindow wonWindow = new WonWindow("X Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button5) {
                ImageIcon icon = new ImageIcon("src/main/resources/XButtons/X5.png");
                B5.setIcon(icon);
                B5.setVisible(true);

                select.setIcon(SelectOImage);
                select.setText("O");

                button5.setEnabled(false);

                ReturnMessage = logic.logic(1,1,1);

                if(ReturnMessage.equals("X Won!")){
                    WonWindow wonWindow = new WonWindow("X Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button6) {
                ImageIcon icon = new ImageIcon("src/main/resources/XButtons/X6.png");
                B6.setIcon(icon);
                B6.setVisible(true);

                select.setIcon(SelectOImage);
                select.setText("O");

                button6.setVisible(false);

                ReturnMessage = logic.logic(1,2,1);

                if(ReturnMessage.equals("X Won!")){
                    WonWindow wonWindow = new WonWindow("X Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button7) {
                ImageIcon icon = new ImageIcon("src/main/resources/XButtons/X7.png");
                B7.setIcon(icon);
                B7.setVisible(true);

                select.setIcon(SelectOImage);
                select.setText("O");

                button7.setEnabled(false);

                ReturnMessage = logic.logic(2,0,1);

                if(ReturnMessage.equals("X Won!")){
                    WonWindow wonWindow = new WonWindow("X Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button8) {
                ImageIcon icon = new ImageIcon("src/main/resources/XButtons/X8.png");
                B8.setIcon(icon);
                B8.setVisible(true);

                select.setIcon(SelectOImage);
                select.setText("O");

                button8.setEnabled(false);

                ReturnMessage = logic.logic(2,1,1);

                if(ReturnMessage.equals("X Won!")){
                    WonWindow wonWindow = new WonWindow("X Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button9) {
                ImageIcon icon = new ImageIcon("src/main/resources/XButtons/X9.png");
                B9.setIcon(icon);
                B9.setVisible(true);

                select.setIcon(SelectOImage);
                select.setText("O");

                button9.setEnabled(false);

                ReturnMessage = logic.logic(2,2,1);

                if(ReturnMessage.equals("X Won!")){
                    WonWindow wonWindow = new WonWindow("X Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            }
        }else {
            if (actionEvent.getSource() == button1) {
                ImageIcon icon = new ImageIcon("src/main/resources/OButtons/O1.png");
                B1.setIcon(icon);
                B1.setVisible(true);

                select.setIcon(SelectXImage);
                select.setText("X");

                button1.setEnabled(false);

                ReturnMessage = logic.logic(0,0,-1);

                if(ReturnMessage.equals("O Won!")){
                    WonWindow wonWindow = new WonWindow("O Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button2) {
                ImageIcon icon = new ImageIcon("src/main/resources/OButtons/O2.png");
                B2.setIcon(icon);
                B2.setVisible(true);

                select.setIcon(SelectXImage);
                select.setText("X");

                button2.setEnabled(false);

                ReturnMessage = logic.logic(0,1,-1);

                if(ReturnMessage.equals("O Won!")){
                    WonWindow wonWindow = new WonWindow("O Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button3) {
                ImageIcon icon = new ImageIcon("src/main/resources/OButtons/O3.png");
                B3.setIcon(icon);
                B3.setVisible(true);

                select.setIcon(SelectXImage);
                select.setText("X");

                button3.setEnabled(false);

                ReturnMessage = logic.logic(0,2,-1);

                if(ReturnMessage.equals("O Won!")){
                    WonWindow wonWindow = new WonWindow("O Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button4) {
                ImageIcon icon = new ImageIcon("src/main/resources/OButtons/O4.png");
                B4.setIcon(icon);
                B4.setVisible(true);

                select.setIcon(SelectXImage);
                select.setText("X");

                button4.setEnabled(false);

                ReturnMessage = logic.logic(1,0,-1);

                if(ReturnMessage.equals("O Won!")){
                    WonWindow wonWindow = new WonWindow("O Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button5) {
                ImageIcon icon = new ImageIcon("src/main/resources/OButtons/O5.png");
                B5.setIcon(icon);
                B5.setVisible(true);

                select.setIcon(SelectXImage);
                select.setText("X");

                button5.setEnabled(false);

                ReturnMessage = logic.logic(1,1,-1);

                if(ReturnMessage.equals("O Won!")){
                    WonWindow wonWindow = new WonWindow("O Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button6) {
                ImageIcon icon = new ImageIcon("src/main/resources/OButtons/O6.png");
                B6.setIcon(icon);
                B6.setVisible(true);

                select.setIcon(SelectXImage);
                select.setText("X");

                button6.setEnabled(false);

                ReturnMessage = logic.logic(1,2,-1);

                if(ReturnMessage.equals("O Won!")){
                    WonWindow wonWindow = new WonWindow("O Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button7) {
                ImageIcon icon = new ImageIcon("src/main/resources/OButtons/O7.png");
                B7.setIcon(icon);
                B7.setVisible(true);

                select.setIcon(SelectXImage);
                select.setText("X");

                button7.setEnabled(false);

                ReturnMessage = logic.logic(2,0,-1);

                if(ReturnMessage.equals("O Won!")){
                    WonWindow wonWindow = new WonWindow("O Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button8) {
                ImageIcon icon = new ImageIcon("src/main/resources/OButtons/O8.png");
                B8.setIcon(icon);
                B8.setVisible(true);

                select.setIcon(SelectXImage);
                select.setText("X");

                button8.setEnabled(false);

                ReturnMessage = logic.logic(2,1,-1);

                if(ReturnMessage.equals("O Won!")){
                    WonWindow wonWindow = new WonWindow("O Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            } else if (actionEvent.getSource() == button9) {
                ImageIcon icon = new ImageIcon("src/main/resources/OButtons/O9.png");
                B9.setIcon(icon);
                B9.setVisible(true);

                select.setIcon(SelectXImage);
                select.setText("X");

                button9.setEnabled(false);

                ReturnMessage = logic.logic(2,2,-1);

                if(ReturnMessage.equals("O Won!")){
                    WonWindow wonWindow = new WonWindow("O Won!");
                }else if(ReturnMessage.equals("Draw!")){
                    WonWindow wonWindow = new WonWindow("Draw!");
                }
            }
        }
    }
}
