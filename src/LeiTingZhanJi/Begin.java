package LeiTingZhanJi;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Begin extends KeyAdapter {
    drew d;
    MyPlane my;
    ExecutorService ex = Executors.newFixedThreadPool(20);//创建线程池
    int zidannum = 0;
    public Begin(MyPlane my,drew d) {
        this.my=my;
        this.d = d;
        CreatEplane c=new CreatEplane(ex,d);
        ex.submit(d);
        ex.submit(my);
        ex.submit(c);
    }

    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        zidannum++;
       if(e.getKeyCode()==KeyEvent.VK_SPACE){
           ex.submit(new ZiDan(zidannum+"",my,d));
       }//按下空格键则创建一个子弹的线程

    }
    public void keyReleased(KeyEvent e) {}
}
