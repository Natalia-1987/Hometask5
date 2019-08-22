import java.util.*;

public class HashMapEx5 {
    public static void main(String[] args) {
        Map<String, Mouse> mice = new HashMap<String, Mouse>();
        mice.put("Fuzzy", new Mouse(0));
        mice.put("Spot", new Mouse(1));
        mice.put("Speedy", new Mouse(2));
        mice.put("Dopey", new Mouse(3));
        mice.put("Sleepy", new Mouse(4));
        mice.put("Happy", new Mouse(5));
        mice.put("Funny", new Mouse(6));
        mice.put("Silly", new Mouse(7));
        mice.put("Stupid", new Mouse(8));
        mice.put("Wowee", new Mouse(9));
        System.out.println(mice);
        System.out.println();
        Set<String> sortedKeys =
                new TreeSet<String>(mice.keySet());
        System.out.println(sortedKeys);
        System.out.println();
        Map<String, Mouse> sortedMouses =
                new LinkedHashMap<String, Mouse>();
        for (String s : sortedKeys) {
            System.out.print("Adding " + s + ", ");
            sortedMouses.put(s, mice.get(s));
        }
        System.out.println();
        System.out.println();
        System.out.println(sortedMouses);
        System.out.println();
    

    Set<String> mice2 = new HashSet<String>();
        mice2.add("Fuzzy");
        mice2.add("Spot");
        mice2.add("Speedy");
        mice2.add("Dopey");
        mice2.add("Sleepy");
        mice2.add("Happy");
        mice2.add("Funny");
        mice2.add("Silly");
        mice2.add("Stupid");
        mice2.add("Wowee");
        System.out.println(mice2);
        System.out.println();
    Set<String> sortedKeys2 =  new TreeSet<String>(mice2);
        System.out.println(sortedKeys);
        System.out.println();
    Set<String> sortedMouses2 = new LinkedHashSet<String>();
        for (String s : sortedKeys2) {
        System.out.print("Adding " + s + ", ");
            sortedMouses2.add(s);
    }
        System.out.println();
        System.out.println();
        System.out.println(sortedMouses2);
        System.out.println();
}
       

}
