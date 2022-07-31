package LeiTingZhanJi;

import javax.swing.*;

//创建一个窗口用于监听键盘的作用
public class windows extends JFrame {
    MyPlane m;
    Begin b;

    public windows(MyPlane m, Begin b) {
        this.m = m;
        this.b = b;
        this.addKeyListener(m);
        this.addKeyListener(b);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
