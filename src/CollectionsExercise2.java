import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionsExercise2 {
    public static void main(String[] args) {
        ArrayList<Mouse> mice = new ArrayList<Mouse>();
        for (int i = 0; i < 10; i++)
            mice.add(new Mouse(i));
        for (int i = 0; i < 10; i++)
            mice.get(i).hop();
        for (Mouse m : mice)
            m.hop();
    }

}

