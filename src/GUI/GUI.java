package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import static javax.swing.GroupLayout.Alignment.*;

public class GUI extends JFrame {
    public GUI() {
        setTitle("Department");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(450,190,1020,597);
        setResizable(false);
        JPanel contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel labelTitle = new JLabel("Department");
        labelTitle.setFont(new Font("Itim", Font.BOLD, 30));
        labelTitle.setBounds(362, 52, 325, 80);
        contentPane.add(labelTitle);
//Labels
        JLabel label1=new JLabel("Name:");
        label1.setBounds(58, 152, 99, 43);
        contentPane.add(label1);
        JLabel label2=new JLabel("Surname:");
        label2.setBounds(58,243,110,29);
        contentPane.add(label2);
        JLabel label3=new JLabel("Age:");
        label2.setBounds(58,324,124,36);
        contentPane.add(label3);

        JTextField name=new JTextField();
        name.setBounds(214, 151, 228, 50);
        contentPane.add(name);
        name.setColumns(10);

        JTextField surname=new JTextField();
        surname.setBounds(214, 235, 228, 50);
        contentPane.add(surname);
        surname.setColumns(10);

        JTextField age=new JTextField();
        age.setBounds(214, 320, 228, 50);
        contentPane.add(age);
        age.setColumns(10);

        JLabel label5=new JLabel("Experience:");
        label5.setBounds(542, 159, 99, 29);
        contentPane.add(label5);

        JLabel label6=new JLabel("Speciality:");
        label6.setBounds(542, 245, 99, 24);
        contentPane.add(label6);

        JTextField experience=new JTextField();
        experience.setBounds(707, 320, 228, 50);
        contentPane.add(experience);
        experience.setColumns(10);


        JTextField speciality=new JTextField();
        speciality.setBounds(707, 235, 228, 50);
        contentPane.add(speciality);
        speciality.setColumns(10);

        JButton button1=new JButton("Add worker");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstname=name.getText();
                String secondname=surname.getText();
                String ageOfPerson=age.getText();
                String experienceOfPerson=experience.getText();
                String specialityOfPerson=speciality.getText();

                String message=firstname;
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_", "root", "root");

                    String query = "INSERT INTO workers values('" + firstname + "','" + secondname + "','" + ageOfPerson + "','" +
                            specialityOfPerson + "','" +experienceOfPerson + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(button1, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(button1,
                                "Welcome, " + message + "Your account is sucessfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        });






      //  JButton button2=new JButton("Fire worker");
      //  JButton button3=new JButton("Set bonus");
      //    JButton button4=new JButton("Correct worker Data");
/*
         JRadioButton radioButton1=new JRadioButton("QA tester");
         JRadioButton radioButton2=new JRadioButton("Java developer");
         JRadioButton radioButton3=new JRadioButton("HR manager");
        JRadioButton radioButton4=new JRadioButton("Back-end developer");


         */






    }
}