import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionsExercise3 {
    public static void main(String[] args) {
        Map<String, Mouse> mice2 = new HashMap<>();
        mice2.put("Sad", new Mouse(0));
        mice2.put("Happy", new Mouse(1));
        mice2.put("Angry", new Mouse(2));
        mice2.put("Sluggish", new Mouse(3));
        mice2.put("Wistful", new Mouse(4));
        mice2.put("Funny", new Mouse(5));
        Iterator<String> it = mice2.keySet().iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s + ": ");
            mice2.get(s).hop();
        }
    }
}
