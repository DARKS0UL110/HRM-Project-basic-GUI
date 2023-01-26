package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class logIn implements ActionListener {

    JFrame logIn;
    JPanel sidebar;
    JPanel pic;
    JLabel image;
    JPanel left;
    JLabel username;
    JLabel password;
    JLabel heading;
    JTextField input_1;
    JPasswordField input_2;
    JButton submit;
    JButton register;
    String user1;
    String pass1;
    String user;
    String pass;
    boolean doctor;
    boolean employee;
    boolean patient;



    logIn(){

        logIn = new JFrame();
        logIn.setSize(950,600);
        logIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logIn.setTitle("LOGIN");
        logIn.setBackground(Color.WHITE);
        logIn.setLayout(null);
        logIn.setResizable(false);
        logIn.setVisible(true);


        sidebar = new JPanel();
        sidebar.setBounds(0,0,450,600);
        sidebar.setBackground(Color.white);
        sidebar.setLayout(null);


        pic = new JPanel();
        pic.setBounds(0,70,450,600);
        pic.setBackground(Color.white);

        ImageIcon img = new ImageIcon("hospital.jpg");
        Image user = img.getImage();
        Image modifiedUserimg = user.getScaledInstance(450,300,Image.SCALE_SMOOTH);
        img= new ImageIcon(modifiedUserimg);
        image = new JLabel();
        image.setIcon(img);


        left = new JPanel();
        left.setBackground(Color.WHITE);
        left.setLayout(null);
        left.setBounds(450,0,500,600);


        heading = new JLabel();
        heading.setText("Sign-In");
        heading.setForeground(Color.black);
        heading.setFont(new Font("Sans serif",Font.PLAIN,35));
        heading.setBounds(180,0,150,100);


        username = new JLabel();
        username.setText("Username");
        username.setBounds(70,60,200,200);
        username.setForeground(Color.black);
        username.setFont(new Font("Sans serif",Font.BOLD,15));

        input_1 = new JTextField();
        input_1.setBounds(70,170,350,50);
        input_1.setFont(new Font("Sans serif",Font.PLAIN,15));


        password = new JLabel();
        password.setText("Password");
        password.setBounds(70,165,200,200);
        password.setForeground(Color.black);
        password.setFont(new Font("Sans serif",Font.BOLD,15));

        input_2 = new JPasswordField();
        input_2.setBounds(70,275,350,50);
        input_2.setFont(new Font("Sans serif",Font.PLAIN,15));


        submit = new JButton();
        submit.setBounds(280,380, 140,50);
        submit.setText("Sign-In");
        submit.setForeground(Color.white);
        submit.setFont(new Font("Sans serif",Font.BOLD,15));
        submit.setBackground(Color.darkGray);
        submit.setFocusable(false);
        submit.addActionListener(this);


        register = new JButton();
        register.setBounds(70,380, 140,50);
        register.setText("Register");
        register.setForeground(Color.white);
        register.setFont(new Font("Sans serif",Font.BOLD,15));
        register.setBackground(Color.darkGray);
        register.setFocusable(false);
        register.addActionListener(this);

        logIn.add(sidebar);
        sidebar.add(pic);
        pic.add(image);
        logIn.add(left);
        left.add(heading);
        left.add(username);
        left.add(input_1);
        left.add(password);
        left.add(input_2);
        left.add(submit);
        left.add(register);




    }




    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==submit){
            user1 = input_1.getText();
            pass1 = input_2.getText();
            if (user1.equals(user) && pass1.equals(pass) && user1 != " " && pass != " "){
                JOptionPane.showMessageDialog(null,"Successfully logged in","Done",JOptionPane.INFORMATION_MESSAGE);
                    if(doctor){
                        doctorTab obj =new doctorTab();
                        obj.name.setText("Dr. "+user);
                        logIn.setVisible(false);
                    }
                    if(employee){
                        employeeTab obj = new employeeTab();
                        obj.name.setText("Mr. "+user);
                        logIn.setVisible(false);
                    }
                    if(patient){
                        patientTab obj = new patientTab();
                        obj.name.setText("Mr. "+user);
                        logIn.setVisible(false);
                    }

            }else{

                JOptionPane.showMessageDialog(null,"login Failed","Error",JOptionPane.WARNING_MESSAGE);

            }
        }

        if (e.getSource()==register){
            logIn.setVisible(false);
             new register();
        }

    }
}
