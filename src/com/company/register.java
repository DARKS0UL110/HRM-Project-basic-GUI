package com.company;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;
import java.awt.*;
public class register implements ActionListener {

    JFrame register;
    JPanel header;
    JPanel sidebar;
    JPanel pic;
    JLabel image;
    JPanel left;
    JLabel heading;
    JLabel user_name;
    JLabel user_pass;
    JLabel user_mail;
    JTextField input_1;
    JTextField input_2;
    JTextField input_3;
    JLabel category;
    JPanel grid1;
    ButtonGroup group;
    JRadioButton btn1;
    JRadioButton btn2;
    JRadioButton btn3;
    JButton submit;


    register(){
        register = new JFrame();
        register.setSize(950,600);
        register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        register.setTitle("Registration");
        register.setBackground(Color.WHITE);
        register.setLayout(null);
        register.setResizable(false);
        register.setVisible(true);

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


        header = new JPanel();
        header.setBounds(0,0,500,60);
        header.setLayout(null);
        header.setBackground(Color.white);

        heading = new JLabel();
        heading.setText("Sign Up");
        heading.setFont(new Font("Sans serif",Font.BOLD,30));
        heading.setBounds(140,0,180,60);
        heading.setForeground(Color.black);


        user_name = new JLabel();
        user_name.setText("Username");
        user_name.setForeground(Color.black);
        user_name.setFont(new Font("Sans serif",Font.BOLD,15));
        user_name.setBounds(30,60,190,80);

        user_pass = new JLabel();
        user_pass.setText("Password");
        user_pass.setForeground(Color.black);
        user_pass.setFont(new Font("Sans serif",Font.BOLD,15));
        user_pass.setBounds(30,100,190,120);

        user_mail = new JLabel();
        user_mail.setText("Email");
        user_mail.setForeground(Color.black);
        user_mail.setFont(new Font("Sans serif",Font.BOLD,15));
        user_mail.setBounds(30,135,190,160);



        input_1 = new JTextField();
        input_1.setBounds(150,85,230,30);

        input_2 = new JTextField();
        input_2.setBounds(150,143,230,30);

        input_3 = new JTextField();
        input_3.setBounds(150,200,230,30);

        left = new JPanel();
        left.setBackground(Color.WHITE);
        left.setLayout(null);
        left.setBounds(450,0,500,600);




        category = new JLabel();
        category.setForeground(Color.black);
        category.setFont(new Font("Sans serif",Font.BOLD,15));
        category.setText("Category");
        category.setBounds(30,205,190,200);

        grid1 = new JPanel();
        grid1.setLayout(new GridLayout(3,1));
        grid1.setBounds(30,320,150,100);


        group = new ButtonGroup();



        btn1 = new JRadioButton();
        btn1.setFont(new Font("Sans serif",Font.BOLD,12));
        btn1.setText("Doctor");
        btn1.setFocusable(false);
        btn1.addActionListener(this);
        btn1.setBackground(Color.WHITE);

        btn2 = new JRadioButton();
        btn2.setFont(new Font("Sans serif",Font.BOLD,12));
        btn2.setText("Employee");
        btn2.setFocusable(false);
        btn2.addActionListener(this);
        btn2.setBackground(Color.WHITE);

        btn3 = new JRadioButton();
        btn3.setFont(new Font("Sans serif",Font.BOLD,12));
        btn3.setText("Patient");
        btn3.setFocusable(false);
        btn3.addActionListener(this);
        btn3.setBackground(Color.WHITE);


        submit = new JButton();
        submit.setText("Register");
        submit.setFocusable(false);
        submit.setBackground(Color.black);
        submit.setFont(new Font("Sans serif",Font.BOLD,17));
        submit.setForeground(Color.white);
        submit.setBounds(140,450,200,50);
        submit.addActionListener(this);


        register.add(sidebar);
        sidebar.add(pic);
        pic.add(image);
        register.add(left);
        left.add(header);
        header.add(heading);
        left.add(user_name);
        left.add(user_pass);
        left.add(user_mail);
        left.add(input_1);
        left.add(input_2);
        left.add(input_3);
        left.add(category);
        left.add(grid1);
        group.add(btn1);
        group.add(btn2);
        group.add(btn3);
        grid1.add(btn1);
        grid1.add(btn2);
        grid1.add(btn3);
        left.add(submit);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==submit){
            logIn obj = new logIn();
            obj.user= input_1.getText();
            obj.pass = input_2.getText();
            obj.doctor = btn1.isSelected();
            obj.employee = btn2.isSelected();
            obj.patient = btn3.isSelected();
            register.setVisible(false);
        }

    }
}
