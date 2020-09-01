import java.util.Iterator;
import java.util.LinkedList;

public class LList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(34);
        linkedList.add(12);
        linkedList.add(19);

        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());

        // Iterate through the linked list
        Iterator it = linkedList.iterator();
        while(it.hasNext()) {
            if ((int) it.next() == 12) {
                System.out.println("Found 12, Yayyy!");
            }
        }
    }
}
