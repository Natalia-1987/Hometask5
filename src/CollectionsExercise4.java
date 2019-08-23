import java.util.*;

public class CollectionsExercise4 {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("Norway");
        mylist.add("Germany");
        mylist.add("Austria");
        mylist.add("Spain");
        mylist.add("Ukraine");

        Collections.sort(mylist);
        System.out.println("Original List : \n" + mylist);
        Collections.shuffle(mylist);
        System.out.println("\nShuffled List : \n" + mylist);




        LinkedList<String> mylist2 = new LinkedList<String>();
        mylist.add("Norway");
        mylist.add("Germany");
        mylist.add("Austria");
        mylist.add("Spain");
        mylist.add("Ukraine");

        Collections.sort(mylist2);
        System.out.println("Original List : \n" + mylist2);
        Collections.shuffle(mylist2);
        System.out.println("\nShuffled List : \n" + mylist2);
    }
}
