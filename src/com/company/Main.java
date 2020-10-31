package com.company;
import GUI.GUI;

import java.awt.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

