package com.hongshi.intern;

import javax.swing.*;

public class App 
{
    public static void main( String[] args )
    {
        JFrame frame = new JFrame("GUIOperator");
        frame.setContentPane(new GUIOperator().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 300);
        frame.pack();
        frame.setVisible(true);
    }
}
