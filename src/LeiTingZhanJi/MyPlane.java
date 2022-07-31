package LeiTingZhanJi;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//自己所操控的飞机
public class MyPlane extends KeyAdapter implements Runnable {
    String name;
    int x=0;
    int y=20;//初始飞机位于最底部
    drew d;

    public MyPlane(String name,drew d){
        this.name = name;
        this.d = d;
        d.marks.put(name,new int[]{x,y,0});
    }
    public void getLocation() {
       d.marks.put(name,new int[]{x,y,0});
    }


    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                if(x>0){x--;}
                break;
            case KeyEvent.VK_W:
                if(y>15){y--;}
                break;
            case KeyEvent.VK_S:
                if(y<20){y++;}
                break;
            case KeyEvent.VK_D:
                if(x<20){x++;}

                break;
        }//操控飞机的移动,并且限定了飞机所飞行的范围

    }
    public void keyReleased(KeyEvent e) {}

    @Override
    public void run() {
       while(true) {
           getLocation();
       }
    }
}
