package LeiTingZhanJi;

public class ZiDan  implements Runnable{
    String name;
    int x;
    int y;
    drew d;
    public ZiDan(String name,MyPlane m,drew d) {
        this.name =name;
        this.x =m.x;
        this.y =m.y+2;
        this.d = d;
        d.marks.put(name,new int[]{x,y,2});
    }//传入飞机位置坐标,用于创建子弹相对应的位置，子弹初始位置是位于飞机的上方两位的

    public  void move(){
        y-=1;
    }//我的飞机所发射的子弹是只能向上发射的，将速度设置为一个默认值要比飞机的飞行速度快

    public void getLocation() {
        d.marks.put(name,new int[]{x,y,2});
    }


    @Override
    public void run() {
while(true) {
    move();
    getLocation();
    try {
        Thread.sleep(300);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    if(y<=1){
        break;//结束线程
    }
}


    }
}
