package LeiTingZhanJi;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Begin {
    public Begin() {
        ExecutorService ex = Executors.newFixedThreadPool(7);//创建线程池
        drew d=new  drew();
        Eplane e1=new Eplane("e1",1,d);
        Eplane e2=new Eplane("e2",3,d);
        MyPlane my=new MyPlane("my",d);
        ZiDan z1=new ZiDan(my,d);
        ZiDan z2=new ZiDan(my,d);
    }
}
