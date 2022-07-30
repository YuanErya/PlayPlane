package LeiTingZhanJi;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//自己所操控的飞机
public class MyPlane extends KeyAdapter {
    int x=0;
    int y=20;//初始飞机位于最底部

    public int [] getLocation() {
        return new int[]{x, y,0};
    }//以数组的形式返回位置,方便绘制图形；

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

}
