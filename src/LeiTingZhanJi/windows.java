package LeiTingZhanJi;
import javax.swing.*;
//创建一个窗口用于监听键盘的作用
public class windows extends JFrame {
    public windows() {
        MyPlane m=new MyPlane();
        this.addKeyListener(m);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
