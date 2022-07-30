package LeiTingZhanJi;

import java.util.HashMap;

public class drew implements Runnable {
    //绘制图形整个画面布局为20*20
//要在此处传入全部对象的位置坐标的相关信息，用于绘制图形，{x,y,n}
// 第三位用于用于判断对象的类型以方便选择所用符号来构建图像n=0是自己飞机，n=1敌人飞机 ，n=2子弹
    HashMap<String, int[]> marks = new HashMap<String, int[]>();//用于储存位置信息

    public void ST() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    @Override
    public void run() {
        while(true) {
        ST();
            System.out.println();
            System.out.println("---------------------------------------------");
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//写死循环用于一直刷新界面

    }
}
