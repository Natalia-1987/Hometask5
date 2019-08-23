import java.util.ArrayList;
import java.util.Iterator;

public class MapCollecEx3 {
    public static void main(String[] args) {
        ArrayList<Mouse> mice = new ArrayList<Mouse>();
        for(int i = 0; i < 10; i++)
            mice.add(new Mouse(i));
        Iterator<Mouse> iter = mice.iterator();
        while(iter.hasNext())
            iter.next().hop();
    }

}
