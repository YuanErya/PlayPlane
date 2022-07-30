package LeiTingZhanJi;

import LeiTingZhanJi.Moving;

import javax.swing.*;

public class windows extends JFrame {
    public windows() {
        Moving m=new Moving();
        this.addKeyListener(m);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);



    }
}
