package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class doctorTab implements ActionListener {

        JFrame doctorTab;
        JButton menu;
        JButton profile;
        JButton mail;
        JButton setting;
        JButton logout;
        JButton help;
        JPanel sidebar;
        JPanel section;
        JLabel pic;
        JLabel name;
        JLabel app;
        JLabel cur_app;
        JLabel tom_app;
        JLabel pre_app;
        JLabel timing;
        JLabel slot1;
        JLabel slot2;
        JLabel slot3;
        JTextField input_1;
        JTextField input_2;
        JTextField input_3;
        ButtonGroup group;
        JRadioButton btn1;
        JRadioButton btn2;
        JRadioButton btn3;
        JRadioButton btn4;
        JRadioButton btn5;
        JRadioButton btn6;







    doctorTab(){

        doctorTab = new JFrame();
        doctorTab.setSize(1200,700);
        doctorTab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        doctorTab.setTitle("Doctor");
        doctorTab.setBackground(Color.WHITE);
        doctorTab.setLayout(null);
        doctorTab.setResizable(false);
        doctorTab.setVisible(true);

        sidebar = new JPanel();
        sidebar.setBounds(0,0,70,700);
        sidebar.setBackground(new Color(0,153,0));
        sidebar.setLayout(null);

        ImageIcon img = new ImageIcon("menu.png");
        Image user = img.getImage();
        Image modifiedUserimg = user.getScaledInstance(30,25,Image.SCALE_SMOOTH);
        img= new ImageIcon(modifiedUserimg);
        menu = new JButton();
        menu.setIcon(img);
        menu.setBounds(10,30,50,50);
        menu.addActionListener(this);
        menu.setBackground(new Color(0,153,0));
        menu.setFocusable(false);
        menu.setBorder(BorderFactory.createEmptyBorder());


        ImageIcon img2 = new ImageIcon("profile.png");
        Image user2 = img2.getImage();
        Image modifiedUserimg2 = user2.getScaledInstance(32,30,Image.SCALE_SMOOTH);
        img2= new ImageIcon(modifiedUserimg2);
        profile = new JButton();
        profile.setIcon(img2);
        profile.setBounds(10,100,50,50);
        profile.addActionListener(this);
        profile.setBackground(new Color(0,153,0));
        profile.setFocusable(false);
        profile.setBorder(BorderFactory.createEmptyBorder());


        ImageIcon img3 = new ImageIcon("mail.png");
        Image user3 = img3.getImage();
        Image modifiedUserimg3 = user3.getScaledInstance(35,30,Image.SCALE_SMOOTH);
        img3= new ImageIcon(modifiedUserimg3);
        mail = new JButton();
        mail.setIcon(img3);
        mail.setBounds(10,175,50,50);
        mail.addActionListener(this);
        mail.setBackground(new Color(0,153,0));
        mail.setFocusable(false);
        mail.setBorder(BorderFactory.createEmptyBorder());


        ImageIcon img4 = new ImageIcon("setting.png");
        Image user4 = img4.getImage();
        Image modifiedUserimg4 = user4.getScaledInstance(32,30,Image.SCALE_SMOOTH);
        img4= new ImageIcon(modifiedUserimg4);
        setting = new JButton();
        setting.setIcon(img4);
        setting.setBounds(10,252,50,50);
        setting.addActionListener(this);
        setting.setBackground(new Color(0,153,0));
        setting.setFocusable(false);
        setting.setBorder(BorderFactory.createEmptyBorder());


        ImageIcon img5 = new ImageIcon("logout.png");
        Image user5 = img5.getImage();
        Image modifiedUserimg5 = user5.getScaledInstance(32,30,Image.SCALE_SMOOTH);
        img5= new ImageIcon(modifiedUserimg5);
        logout = new JButton();
        logout.setIcon(img5);
        logout.setBounds(10,333,50,50);
        logout.addActionListener(this);
        logout.setBackground(new Color(0,153,0));
        logout.setFocusable(false);
        logout.setBorder(BorderFactory.createEmptyBorder());


        ImageIcon img6 = new ImageIcon("help.png");
        Image user6 = img6.getImage();
        Image modifiedUserimg6 = user6.getScaledInstance(32,30,Image.SCALE_SMOOTH);
        img6= new ImageIcon(modifiedUserimg6);
        help = new JButton();
        help.setIcon(img6);
        help.setBounds(10,415,50,50);
        help.addActionListener(this);
        help.setBackground(new Color(0,153,0));
        help.setFocusable(false);
        help.setBorder(BorderFactory.createEmptyBorder());




        section = new JPanel();
        section.setBounds(70,0,1200,700);
        section.setBackground(Color.white);
        section.setLayout(null);

        ImageIcon img7 = new ImageIcon("doctor.png");
        Image user7 = img7.getImage();
        Image modifiedUserimg7 = user7.getScaledInstance(150,150,Image.SCALE_SMOOTH);
        img7= new ImageIcon(modifiedUserimg7);
        pic = new JLabel();
        pic.setIcon(img7);
        pic.setBounds(20,0,200,150);

        name = new JLabel();
        name.setFont(new Font("Sans serif",Font.BOLD,30));
        name.setBounds(50,70,200,200);
        name.setForeground(Color.black);

        app = new JLabel();
        app.setFont(new Font("Sans serif",Font.BOLD,20));
        app.setText("Appointments");
        app.setForeground(Color.darkGray);
        app.setBounds(50,190,150,100);

        cur_app = new JLabel();
        cur_app.setFont(new Font("Sans serif",Font.BOLD,15));
        cur_app.setText("Current");
        cur_app.setForeground(Color.darkGray);
        cur_app.setBounds(50,230,150,100);


        input_1 = new JTextField();
        input_1.setText("Your appointment is fixed with Mr. Amjad");
        input_1.setBackground(Color.white);
        input_1.setEditable(false);
        input_1.setBounds(50,290,235,45);
        input_1.setBorder(BorderFactory.createEmptyBorder());
        input_1.setFont(new Font("Sans serif",Font.PLAIN,12));


        tom_app = new JLabel();
        tom_app.setFont(new Font("Sans serif",Font.BOLD,15));
        tom_app.setText("Tomorrow");
        tom_app.setForeground(Color.darkGray);
        tom_app.setBounds(350,230,150,100);

        input_2 = new JTextField();
        input_2.setBounds(350,290,235,45);
        input_2.setText("Tomorrow appointment is with Mr. Junaid");
        input_2.setBackground(Color.white);
        input_2.setBorder(BorderFactory.createEmptyBorder());
        input_2.setFont(new Font("Sans serif",Font.PLAIN,12));


        pre_app = new JLabel();
        pre_app.setFont(new Font("Sans serif",Font.BOLD,15));
        pre_app.setText("Previous");
        pre_app.setForeground(Color.darkGray);
        pre_app.setBounds(650,230,150,100);

        input_3 = new JTextField();
        input_3.setBounds(650,290,250,45);
        input_3.setText("Yesterday appointment was with Mr. Dawood");
        input_3.setBackground(Color.white);
        input_3.setBorder(BorderFactory.createEmptyBorder());
        input_3.setFont(new Font("Sans serif",Font.PLAIN,12));


        timing = new JLabel();
        timing.setFont(new Font("Sans serif",Font.BOLD,20));
        timing.setText("Schedule");
        timing.setForeground(Color.darkGray);
        timing.setBounds(50,360,150,100);

        slot1 = new JLabel();
        slot1.setFont(new Font("Sans serif",Font.BOLD,17));
        slot1.setText("Slot-1");
        slot1.setForeground(Color.darkGray);
        slot1.setBounds(50,400,150,100);

        group = new ButtonGroup();

        btn1 = new JRadioButton();
        btn1.setFont(new Font("Sans serif",Font.PLAIN,15));
        btn1.setText("6:00 am - 8:00 am");
        btn1.setBounds(50,470,150,20);
        btn1.setBackground(Color.WHITE);
        btn1.setFocusable(false);

        btn2 = new JRadioButton();
        btn2.setFont(new Font("Sans serif",Font.PLAIN,15));
        btn2.setText("8:00 am - 10:00 am");
        btn2.setBounds(50,500,160,20);
        btn2.setBackground(Color.WHITE);
        btn2.setFocusable(false);


        slot2 = new JLabel();
        slot2.setFont(new Font("Sans serif",Font.BOLD,17));
        slot2.setText("Slot-2");
        slot2.setForeground(Color.darkGray);
        slot2.setBounds(350,400,150,100);

        btn3 = new JRadioButton();
        btn3.setFont(new Font("Sans serif",Font.PLAIN,15));
        btn3.setText("10:00 am - 12:00 am");
        btn3.setBounds(350,470,160,20);
        btn3.setBackground(Color.WHITE);
        btn3.setFocusable(false);

        btn4 = new JRadioButton();
        btn4.setFont(new Font("Sans serif",Font.PLAIN,15));
        btn4.setText("12:00 pm - 2:00 pm");
        btn4.setBounds(350,500,160,20);
        btn4.setBackground(Color.WHITE);
        btn4.setFocusable(false);


        slot3 = new JLabel();
        slot3.setFont(new Font("Sans serif",Font.BOLD,17));
        slot3.setText("Slot-3");
        slot3.setForeground(Color.darkGray);
        slot3.setBounds(650,400,150,100);

        btn5 = new JRadioButton();
        btn5.setFont(new Font("Sans serif",Font.PLAIN,15));
        btn5.setText("2:00 pm - 4:00 pm");
        btn5.setBounds(650,470,160,20);
        btn5.setBackground(Color.WHITE);
        btn5.setFocusable(false);

        btn6 = new JRadioButton();
        btn6.setFont(new Font("Sans serif",Font.PLAIN,15));
        btn6.setText("4:00 pm - 6:00 pm");
        btn6.setBounds(650,500,160,20);
        btn6.setBackground(Color.WHITE);
        btn6.setFocusable(false);




        doctorTab.add(sidebar);
        sidebar.add(menu);
        sidebar.add(mail);
        sidebar.add(profile);
        sidebar.add(setting);
        sidebar.add(logout);
        sidebar.add(help);
        doctorTab.add(section);
        section.add(pic);
        section.add(name);
        section.add(app);
        section.add(cur_app);
        section.add(input_1);
        section.add(tom_app);
        section.add(input_2);
        section.add(pre_app);
        section.add(input_3);
        section.add(timing);
        group.add(btn1);
        group.add(btn2);
        group.add(btn3);
        group.add(btn4);
        group.add(btn5);
        group.add(btn6);
        section.add(slot1);
        section.add(btn1);
        section.add(btn2);
        section.add(slot2);
        section.add(btn3);
        section.add(btn4);
        section.add(slot3);
        section.add(btn5);
        section.add(btn6);





    }








    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==logout){
            doctorTab.setVisible(false);
            new logIn();


        }

    }
}
