import java.util.*;
public class Dequey {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(2);
        q.addFirst(1);
        q.addLast(3);
        q.addLast(4);
        q.removeLast();
        q.removeFirst();
        System.out.println(q);
        System.out.println("The first element in the queue is " + q.getFirst());
        System.out.println("The last element in the queue is "+ q.getLast());
    }
}
