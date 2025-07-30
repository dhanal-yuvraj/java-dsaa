import java.util.*;
public class LLFrameworks {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        //0->1->2->3
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst(); 
        //1->2
        System.out.println(ll);
    }
}
