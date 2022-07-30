package LeiTingZhanJi;

public class ZiDan {
    int x;
    int y;
    public ZiDan(MyPlane m) {
        this.x =m.x;
        this.y =m.y+2;
    }//传入飞机位置坐标,用于创建子弹相对应的位置，子弹初始位置是位于飞机的上方两位的

    public  void move(){
        y-=2;
    }//我的飞机所发射的子弹是只能向上发射的，将速度设置为一个默认值要比飞机的飞行速度快

    public int [] getLocation() {
        return new int[]{x, y,2};
    }//以数组的形式返回位置,方便绘制图形；
}
