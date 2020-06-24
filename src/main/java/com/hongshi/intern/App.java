package com.hongshi.intern;

public class App {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUIOperator guiOperator = new GUIOperator();
                guiOperator.createAndShowGUi();
            }
        });
    }
}
