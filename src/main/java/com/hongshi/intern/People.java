package com.hongshi.intern;

public class People {
//    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                GUIOperator guiOperator = new GUIOperator();
//                guiOperator.createAndShowGUi();
//            }
//        });
//    }

    public static void main(String[] args) throws Exception {
        Elevator elevator = Elevator.getInstance();

        elevator.startRun();
        elevator.toGo(3, true);
        elevator.toGo(1, null);

        elevator.toGo(4, false);
        elevator.toGo(5, true);

        elevator.toGo(7, false);
        elevator.toGo(6, true);
        elevator.toGo(8, false);

        elevator.toGo(10, false);
        elevator.toGo(9, true);

        elevator.toGo(10, true);
        elevator.toGo(10, null);

//        Thread.sleep(3000); //3秒后断电。
//        elevator.stopRun();

        elevator.toGo(20, null);
    }
}
