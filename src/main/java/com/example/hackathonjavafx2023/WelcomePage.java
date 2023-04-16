package com.example.hackathonjavafx2023;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class WelcomePage {
    private JTextField studySession;
    private JButton submit;

    private int studyHrs;
    private JTabbedPane panel;
    WelcomePage(String userID) {
        studyHrs = 0;
//        JLabel welcomeLabel = new JLabel("Hello!");
//        JFrame frame = new JFrame();
//
//        welcomeLabel.setBounds(0,0,200,35);
//        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
//        frame.add(welcomeLabel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(420, 420);
//        frame.setLayout(null);
//        frame.setVisible(true);


        JFrame frame = new JFrame("My Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Create a custom JPanel with the background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    JTabbedPane panel = new JTabbedPane();
                    Image image = ImageIO.read(new File("C:/Users/moham/Downloads/logo.png"));
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
                    g.setFont(new Font("Arial", Font.BOLD, 25));
                    g.drawString("Hello " + userID + "!", 20, 30);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };




        JPanel panel1 = new JPanel();
        panel1.setName("Tasks");
        panel1.add(new JLabel("Current tasks: Study for " + studyHrs, SwingConstants.CENTER));
        JPanel panel2 = new JPanel();
        panel2.setName("Calendar");
        panel2.add(new JLabel("This is the content of tab 2", SwingConstants.CENTER));
        JPanel panel3 = new JPanel();
        panel3.setName("Study Sessions");
        panel3.add(new JLabel("How many hours would you like to study?", SwingConstants.CENTER));


        studySession = new JTextField();
        studySession.setPreferredSize(new Dimension(250, 40));
        submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                         if (e.getSource() == e) {
                                             int hours = Integer.parseInt(submit.getText());
                                             studyHrs += hours;
                                             System.out.println("Your study session has been submitted!");
                                         }
                                     }
                                 });


        panel3.add(studySession);
        panel3.add(submit);

        ImageIcon imageIcon = new ImageIcon("C:/Users/moham/Downloads/logo.png");


        JTabbedPane tabbedPane = new JTabbedPane(); // Add the panel to the frame
        tabbedPane.setName("Main page");

        tabbedPane.add(panel);
        tabbedPane.add(panel1);
        tabbedPane.add(panel2);
        tabbedPane.add(panel3);


        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);

//        public java.awt.event.ActionListener actionPerformed(ActionEvent e) {
//            if(e.getSource() == submit) {
//                System.out.println("Your study session was submitted!");
//            }
//        }




//        JLabel label = new JLabel("Hello, " + userID + "!") {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                g.setColor(Color.RED);
//                g.setFont(new Font("Arial", Font.BOLD, 100));
//                g.drawString("Java Swing", 0, 0);
//            }
//        };
//
//        // Add the label to a panel and add the panel to the frame
//        JPanel welcomeUser = new JPanel();
//        panel.add(label);
//        frame.getContentPane().add(panel);
//
//        frame.pack();
//        frame.setVisible(true);


    }
}