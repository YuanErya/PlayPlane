package LeiTingZhanJi;

//敌人飞机类，由于我的飞机类要继承KeyAdapter,故没有创建飞机公共父类
public class Eplane implements Runnable {
    String name;
    int x;
    int y=0;
    drew d;

    public Eplane(String name, drew d) {
        this.name = name;
        this.x =(int)(Math.random()*20);//随机生成敌人飞机的位置
        this.d =d;
        d.marks.put(name,new int[]{x,y,1});
    }//传入飞机位置坐标；

    public  void move(){
        y++;
    }//敌人飞机只能向下方移动

    public void getLocation() {
        d.marks.put(name,new int[]{x,y,1});
    }


    @Override
    public void run() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }//线程睡眠实现敌人飞机的悬停
        while(true) {
            move();
            getLocation();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(y>=21){
                break;
            }
        }

    }
}
