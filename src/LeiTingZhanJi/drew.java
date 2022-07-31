package LeiTingZhanJi;

import java.util.ArrayList;
import java.util.HashMap;

public class drew implements Runnable {
    //绘制图形整个画面布局为20*20
//要在此处传入全部对象的位置坐标的相关信息，用于绘制图形，{x,y,n}
// 第三位用于用于判断对象的类型以方便选择所用符号来构建图像n=0是自己飞机，n=1敌人飞机 ，n=2子弹
    HashMap<String, int[]> marks = new HashMap<String, int[]>();//用于储存位置信息
    HashMap<String,String> jxh=new HashMap<String,String>();//用于储存解析后的坐标信息key值用于储存相关的位置信息，V值用于储存该坐标处所用的符号的信息

    //该方法用于绘制图形
    public void ST() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(jxh.containsKey("x"+i+"y"+j)){
                    System.out.println(jxh.get("x"+i+"y"+j));
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //通过传入的各个对象的坐标位置，用于解析出每一个点处的符号信息
    public void jx(){
       for(int[] v:marks.values()){
           switch(v[2]){
               case 0://获取到自身的飞机的时候
                   jxh.put("x"+v[0]+"y"+v[1],"=");
                   jxh.put("x"+(v[0]-1)+"y"+v[1],"=");
                   jxh.put("x"+(v[0]+1)+"y"+v[1],"=");
                   jxh.put("x"+v[0]+"y"+(v[1]-1),"|");
               case 1://获取到敌人的飞机
                   jxh.put("x"+v[0]+"y"+v[1],"=");
                   jxh.put("x"+(v[0]-1)+"y"+v[1],"=");
                   jxh.put("x"+(v[0]+1)+"y"+v[1],"=");
                   jxh.put("x"+v[0]+"y"+(v[1]+1),"|");
               case 2://获取到子弹信息
                   jxh.put("x"+v[0]+"y"+v[1],"*");
           }
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
