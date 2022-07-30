package LeiTingZhanJi;

//敌人飞机类，由于我的飞机类要继承KeyAdapter,故没有创建飞机公共父类
public class Eplane implements Runnable {
    String name;
    int x;
    int y=0;
    drew d;

    public Eplane(String name,int x, drew d) {
        this.name = name;
        this.x =x;
        this.d =d;
        d.marks.put(name,new int[]{x,y,1});
    }//传入飞机位置坐标；

    public  void move(){
        y++;
    }//敌人飞机只能向下方移动

    public void getLocation() {
        d.marks.remove(name);
        d.marks.put(name,new int[]{x,y,2});
    }


    @Override
    public void run() {
        while(true) {

        }

    }
}
