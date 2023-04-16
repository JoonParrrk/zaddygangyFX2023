package com.example.hackathonjavafx2023;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JCheckBox showPasswordCheckBox = new JCheckBox("Show Password");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("Username:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel titleLabel = new JLabel("Login Page");
    JLabel messageLabel = new JLabel();
    HashMap<String, String> logininfo = new HashMap<String, String>();
    IDandPasswords hashy = new IDandPasswords();

    LoginPage() {

        logininfo = hashy.getLoginInfo();

        titleLabel.setBounds(125, 20, 200, 25);
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 20));
        titleLabel.setForeground(Color.BLACK);

        userIDLabel.setBounds(50, 70, 100, 25);
        userIDLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
        userIDLabel.setForeground(Color.BLACK);

        userPasswordLabel.setBounds(50, 110, 100, 25);
        userPasswordLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
        userPasswordLabel.setForeground(Color.BLACK);

        messageLabel.setBounds(125, 240, 250, 25);
        messageLabel.setFont(new Font("Roboto", Font.PLAIN, 14));

        userIDField.setBounds(130, 70, 200, 25);
        userPasswordField.setBounds(130, 110, 200, 25);

        showPasswordCheckBox.setBounds(130, 140, 150, 25);
        showPasswordCheckBox.setFont(new Font("Roboto", Font.PLAIN, 12));
        showPasswordCheckBox.addActionListener(this);

        loginButton.setBounds(130, 180, 80, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        loginButton.setBackground(new Color(0, 128, 128));
        loginButton.setForeground(Color.WHITE);

        resetButton.setBounds(250, 180, 80, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        resetButton.setBackground(new Color(0, 128, 128));
        resetButton.setForeground(Color.WHITE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(200, 230, 230));
        panel.setLayout(null);
        panel.add(titleLabel);
        panel.add(userIDLabel);
        panel.add(userPasswordLabel);
        panel.add(userIDField);
        panel.add(userPasswordField);
        panel.add(showPasswordCheckBox);
        panel.add(loginButton);
        panel.add(resetButton);
        panel.add(messageLabel);

        frame.getContentPane().setBackground(new Color(200, 230, 230));
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
            messageLabel.setText("");
        }

        if (e.getSource() == loginButton) {

            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                } else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Wrong password");
                }

            } else {
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Username not found");
            }
        }

        if (e.getSource() == showPasswordCheckBox) {
            if (showPasswordCheckBox.isSelected()) {
                userPasswordField.setEchoChar((char) 0);
            } else {
                userPasswordField.setEchoChar('*');
            }
        }
    }
}

