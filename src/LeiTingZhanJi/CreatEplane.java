package LeiTingZhanJi;

import java.util.concurrent.ExecutorService;

public class CreatEplane implements Runnable {
    ExecutorService ex;
    drew d;
    public CreatEplane(ExecutorService ex,drew d){
        this.ex = ex;
        this.d = d;
    }
    @Override
    public void run() {
        int i=0;
        while (true) {
            ex.submit(new Eplane(i+"",d));
            i++;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
