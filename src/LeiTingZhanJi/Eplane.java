package LeiTingZhanJi;

//敌人飞机类，由于我的飞机类要继承KeyAdapter,故没有创建飞机公共父类
public class Eplane  {
    int x;
    int y;
    public Eplane(int x, int y) {
        this.x =x;
        this.y =y;
    }//传入飞机位置坐标；

    public  void move(){
        y++;
    }//敌人飞机只能向下方移动

    public int [] getLocation() {
        return new int[]{x, y,1};
    }//以数组的形式返回位置,方便绘制图形；
}