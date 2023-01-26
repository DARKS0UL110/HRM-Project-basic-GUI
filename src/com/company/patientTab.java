package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class patientTab implements ActionListener {

    JFrame patientTab;
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
    JLabel rec;
    JLabel des;
    JLabel prec;
    JLabel exp;
    JLabel update;
    JLabel slot1;
    JLabel slot2;
    JLabel slot3;
    JTextField input_1;
    JTextField input_2;
    JTextField input_3;
    JTextArea text1;
    JTextArea text2;
    JTextArea text3;









    patientTab(){

        patientTab = new JFrame();
        patientTab.setSize(1200,700);
        patientTab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        patientTab.setTitle("Patient");
        patientTab.setBackground(Color.WHITE);
        patientTab.setLayout(null);
        patientTab.setResizable(false);
        patientTab.setVisible(true);

        sidebar = new JPanel();
        sidebar.setBounds(0,0,70,700);
        sidebar.setBackground(new Color(255,140,0));
        sidebar.setLayout(null);

        ImageIcon img = new ImageIcon("menu.png");
        Image user = img.getImage();
        Image modifiedUserimg = user.getScaledInstance(30,25,Image.SCALE_SMOOTH);
        img= new ImageIcon(modifiedUserimg);
        menu = new JButton();
        menu.setIcon(img);
        menu.setBounds(10,30,50,50);
        menu.addActionListener(this);
        menu.setBackground(new Color(255,140,0));
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
        profile.setBackground(new Color(255,140,0));
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
        mail.setBackground(new Color(255,140,0));
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
        setting.setBackground(new Color(255,140,0));
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
        logout.setBackground(new Color(255,140,0));
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
        help.setBackground(new Color(255,140,0));
        help.setFocusable(false);
        help.setBorder(BorderFactory.createEmptyBorder());




        section = new JPanel();
        section.setBounds(70,0,1200,700);
        section.setBackground(Color.white);
        section.setLayout(null);

        ImageIcon img7 = new ImageIcon("patient2.png");
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

        rec = new JLabel();
        rec.setFont(new Font("Sans serif",Font.BOLD,20));
        rec.setText("Record");
        rec.setForeground(Color.darkGray);
        rec.setBounds(50,190,150,100);

        des = new JLabel();
        des.setFont(new Font("Sans serif",Font.BOLD,15));
        des.setText("Disease");
        des.setForeground(Color.darkGray);
        des.setBounds(50,230,150,100);


        input_1 = new JTextField();
        input_1.setBounds(50,290,230,45);
        input_1.setText("Fever and Flu with dry cough.");
        input_1.setBackground(Color.white);
        input_1.setEditable(false);
        input_1.setBorder(BorderFactory.createEmptyBorder());
        input_1.setFont(new Font("Sans serif",Font.PLAIN,15));


        prec = new JLabel();
        prec.setFont(new Font("Sans serif",Font.BOLD,15));
        prec.setText("Prescribtion");
        prec.setForeground(Color.darkGray);
        prec.setBounds(350,230,150,100);

        input_2 = new JTextField();
        input_2.setBounds(350,290,250,45);
        input_2.setText("Panandol with Aspirin Tab - Two Dose.");
        input_2.setBackground(Color.white);
        input_2.setEditable(false);
        input_2.setBorder(BorderFactory.createEmptyBorder());
        input_2.setFont(new Font("Sans serif",Font.PLAIN,15));


        exp = new JLabel();
        exp.setFont(new Font("Sans serif",Font.BOLD,15));
        exp.setText("Expenditures");
        exp.setForeground(Color.darkGray);
        exp.setBounds(650,230,150,100);

        input_3 = new JTextField();
        input_3.setBounds(650,290,235,45);
        input_3.setText("Total Cost - Rs 1500.");
        input_3.setBackground(Color.white);
        input_3.setEditable(false);
        input_3.setBorder(BorderFactory.createEmptyBorder());
        input_3.setFont(new Font("Sans serif",Font.PLAIN,15));


        update = new JLabel();
        update.setFont(new Font("Sans serif",Font.BOLD,20));
        update.setText("Latest Updates");
        update.setForeground(Color.darkGray);
        update.setBounds(50,360,150,100);

        slot1 = new JLabel();
        slot1.setFont(new Font("Sans serif",Font.BOLD,17));
        slot1.setText("Dr appointments");
        slot1.setForeground(Color.darkGray);
        slot1.setBounds(50,400,150,100);



        text1 = new JTextArea();
        text1.setFont(new Font("Sans serif",Font.PLAIN,15));
        text1.setBounds(50,470,230,150);
        text1.setText("Your appointment is fixed"+"\n"+"with Dr. Ashraf General."+"\n"+"Physician at 2nd floor"+"\n"+"room no: 1, City Hospital."+"\n"+"Timing : 10:00 Am.");
        text1.setBorder(BorderFactory.createRaisedBevelBorder());
        text1.setBackground(Color.WHITE);
        text1.setFocusable(false);




        slot2 = new JLabel();
        slot2.setFont(new Font("Sans serif",Font.BOLD,17));
        slot2.setText("Room update");
        slot2.setForeground(Color.darkGray);
        slot2.setBounds(350,400,160,100);

        text2 = new JTextArea();
        text2.setFont(new Font("Sans serif",Font.PLAIN,15));
        text2.setBounds(350,470,230,150);
        text2.setText("Vacant Rooms:-"+"\n"+"Room no: 03 at 1st floor."+"\n"+"Room no: 06 at 4th floor."+"\n"+"Room no: 08 at 6th floor."+"\n"+"Room no: 2nd at 5th floor.");
        text2.setBorder(BorderFactory.createRaisedBevelBorder());
        text2.setBackground(Color.WHITE);
        text2.setFocusable(false);




        slot3 = new JLabel();
        slot3.setFont(new Font("Sans serif",Font.BOLD,17));
        slot3.setText("News Feed");
        slot3.setForeground(Color.darkGray);
        slot3.setBounds(650,400,150,100);

        text3 = new JTextArea();
        text3.setFont(new Font("Sans serif",Font.PLAIN,15));
        text3.setBounds(650,470,230,150);
        text3.setText("Current political situation..."+"\n"+"Viral News..."+"\n"+"Entertainment..."+"\n"+"Latest Inventions...."+"\n"+"Our Success..."+"\n"+"Articles...");
        text3.setBorder(BorderFactory.createRaisedBevelBorder());
        text3.setBackground(Color.WHITE);
        text3.setFocusable(false);




        patientTab.add(sidebar);
        sidebar.add(menu);
        sidebar.add(mail);
        sidebar.add(profile);
        sidebar.add(setting);
        sidebar.add(logout);
        sidebar.add(help);
        patientTab.add(section);
        section.add(pic);
        section.add(name);
        section.add(rec);
        section.add(des);
        section.add(input_1);
        section.add(prec);
        section.add(input_2);
        section.add(exp);
        section.add(input_3);
        section.add(update);
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
            patientTab.setVisible(false);
            new logIn();


        }

    }
}
