package LeiTingZhanJi;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Moving extends KeyAdapter {
    int x = 0, y = 40;

    public void keyTyped(KeyEvent e) {}


    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                x--;
                break;
            case KeyEvent.VK_W:
                y--;
                break;
            case KeyEvent.VK_S:
                y++;
                break;
            case KeyEvent.VK_D:
                x++;
                break;
        }

    }

    public void keyReleased(KeyEvent e) {}
}





