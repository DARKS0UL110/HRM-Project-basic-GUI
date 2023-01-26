package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class employeeTab implements ActionListener {

    JFrame employeeTab;
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
    JLabel memo;
    JLabel pre_days;
    JLabel rem_days;
    JLabel sal_up;
    JLabel notification;
    JLabel slot1;
    JLabel slot2;
    JLabel slot3;
    JTextField input_1;
    JTextField input_2;
    JTextField input_3;
    JTextArea text1;
    JTextArea text2;
    JTextArea text3;








    employeeTab(){

        employeeTab = new JFrame();
        employeeTab.setSize(1200,700);
        employeeTab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeTab.setTitle("Employee");
        employeeTab.setBackground(Color.WHITE);
        employeeTab.setLayout(null);
        employeeTab.setResizable(false);
        employeeTab.setVisible(true);

        sidebar = new JPanel();
        sidebar.setBounds(0,0,70,700);
        sidebar.setBackground(new Color(11,168,230));
        sidebar.setLayout(null);

        ImageIcon img = new ImageIcon("menu.png");
        Image user = img.getImage();
        Image modifiedUserimg = user.getScaledInstance(30,25,Image.SCALE_SMOOTH);
        img= new ImageIcon(modifiedUserimg);
        menu = new JButton();
        menu.setIcon(img);
        menu.setBounds(10,30,50,50);
        menu.addActionListener(this);
        menu.setBackground(new Color(11,168,230));
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
        profile.setBackground(new Color(11,168,230));
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
        mail.setBackground(new Color(11,168,230));
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
        setting.setBackground(new Color(11,168,230));
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
        logout.setBackground(new Color(11,168,230));
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
        help.setBackground(new Color(11,168,230));
        help.setFocusable(false);
        help.setBorder(BorderFactory.createEmptyBorder());




        section = new JPanel();
        section.setBounds(70,0,1200,700);
        section.setBackground(Color.white);
        section.setLayout(null);

        ImageIcon img7 = new ImageIcon("employee.jpg");
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

        memo = new JLabel();
        memo.setFont(new Font("Sans serif",Font.BOLD,20));
        memo.setText("Memory");
        memo.setForeground(Color.darkGray);
        memo.setBounds(50,190,150,100);

        pre_days = new JLabel();
        pre_days.setFont(new Font("Sans serif",Font.BOLD,15));
        pre_days.setText("Present Days");
        pre_days.setForeground(Color.darkGray);
        pre_days.setBounds(50,230,150,100);


        input_1 = new JTextField();
        input_1.setBounds(50,290,235,45);
        input_1.setText("You were present 26 days out of 30.");
        input_1.setBackground(Color.white);
        input_1.setEditable(false);
        input_1.setBorder(BorderFactory.createEmptyBorder());
        input_1.setFont(new Font("Sans serif",Font.PLAIN,15));


        rem_days = new JLabel();
        rem_days.setFont(new Font("Sans serif",Font.BOLD,15));
        rem_days.setText("Remaining leaves");
        rem_days.setForeground(Color.darkGray);
        rem_days.setBounds(350,230,150,100);

        input_2 = new JTextField();
        input_2.setBounds(350,290,235,45);
        input_2.setText("You have 6 leaves remaining.");
        input_2.setBackground(Color.white);
        input_2.setEditable(false);
        input_2.setBorder(BorderFactory.createEmptyBorder());
        input_2.setFont(new Font("Sans serif",Font.PLAIN,15));


        sal_up = new JLabel();
        sal_up.setFont(new Font("Sans serif",Font.BOLD,15));
        sal_up.setText("Salary updates");
        sal_up.setForeground(Color.darkGray);
        sal_up.setBounds(650,230,150,100);

        input_3 = new JTextField();
        input_3.setBounds(650,290,235,45);
        input_3.setText("Rs 25,000 credited to your account.");
        input_3.setBackground(Color.white);
        input_3.setEditable(false);
        input_3.setBorder(BorderFactory.createEmptyBorder());
        input_3.setFont(new Font("Sans serif",Font.PLAIN,15));


        notification = new JLabel();
        notification.setFont(new Font("Sans serif",Font.BOLD,20));
        notification.setText("Notifications");
        notification.setForeground(Color.darkGray);
        notification.setBounds(50,360,150,100);

        slot1 = new JLabel();
        slot1.setFont(new Font("Sans serif",Font.BOLD,17));
        slot1.setText("Updated timings");
        slot1.setForeground(Color.darkGray);
        slot1.setBounds(50,400,150,100);



        text1 = new JTextArea();
        text1.setFont(new Font("Sans serif",Font.PLAIN,15));
        text1.setText("Hospital management has change"+"\n"+ "their timings. You can get the"+"\n"+"schedule from Admin Office."+"\n"+"Furthermore you will be notified"+"\n"+"about futher updates regarding"+"\n"+"timings and other activites.");
        text1.setBounds(50,470,230,150);
        text1.setBorder(BorderFactory.createRaisedBevelBorder());
        text1.setBackground(Color.WHITE);
        text1.setFocusable(false);




        slot2 = new JLabel();
        slot2.setFont(new Font("Sans serif",Font.BOLD,17));
        slot2.setText("Join Health-Seminar");
        slot2.setForeground(Color.darkGray);
        slot2.setBounds(350,400,160,100);

        text2 = new JTextArea();
        text2.setFont(new Font("Sans serif",Font.PLAIN,15));
        text2.setText("Hospital has arranged a Health"+"\n"+"Seminar on Cancer. In which"+"\n"+"we have invited specialist to give"+"\n"+"a brief Knowlidge about"+"\n"+"cancer regarding its symtoms"+"\n"+"causes and treatments.");
        text2.setBounds(350,470,230,150);
        text2.setBorder(BorderFactory.createRaisedBevelBorder());
        text2.setBackground(Color.WHITE);
        text2.setFocusable(false);




        slot3 = new JLabel();
        slot3.setFont(new Font("Sans serif",Font.BOLD,17));
        slot3.setText("Recent News");
        slot3.setForeground(Color.darkGray);
        slot3.setBounds(650,400,150,100);

        text3 = new JTextArea();
        text3.setFont(new Font("Sans serif",Font.PLAIN,15));
        text3.setBounds(650,470,230,150);
        text3.setText("1. Hospital Construction..."+"\n"+"2. New vacancy..."+"\n"+"3. Join Group..."+"\n"+"4. Visit Dr.Ahmed..."+"\n"+"5. New MD...");
        text3.setBorder(BorderFactory.createRaisedBevelBorder());
        text3.setBackground(Color.WHITE);
        text3.setFocusable(false);






        employeeTab.add(sidebar);
        sidebar.add(menu);
        sidebar.add(mail);
        sidebar.add(profile);
        sidebar.add(setting);
        sidebar.add(logout);
        sidebar.add(help);
        employeeTab.add(section);
        section.add(pic);
        section.add(name);
        section.add(memo);
        section.add(pre_days);
        section.add(input_1);
        section.add(rem_days);
        section.add(input_2);
        section.add(sal_up);
        section.add(input_3);
        section.add(notification);

        section.add(slot1);
        section.add(text1);

        section.add(slot2);
        section.add(text2);

        section.add(slot3);
        section.add(text3);









    }





    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==logout){
            employeeTab.setVisible(false);
            new logIn();


        }

    }
}
