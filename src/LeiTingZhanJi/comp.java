package LeiTingZhanJi;

import java.lang.reflect.Array;
import java.util.Comparator;

public class comp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        return (int)Array.get(o1,0)-(int)Array.get(o2,0);
    }
}
