package SFT;

import java.util.ArrayList;

public class RecentCounter {
    int re;
    ArrayList<Integer> num = new ArrayList<Integer>();

    public RecentCounter() {
        this.re = 0;
    }

    public int ping(int t) {
        num.add(t);
        re = 0;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) >= t - 3000 && num.get(i) <= t) {
                re++;
            }
        }
        return re;
    }


}
