package LeiTingZhanJi;

public class Test {
    public static void main(String[] args) {
        drew d=new  drew();
        MyPlane m=new MyPlane("my",d);
        Begin b=new Begin(m,d);
        windows w=new windows(m);//创建用于监控键盘的窗口

    }
}
