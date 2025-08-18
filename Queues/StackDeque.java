import java.util.*;
public class StackDeque {
    static class Stack{
        static Deque<Integer> q = new LinkedList<>();
        public static boolean isEmpty(){
            return q.isEmpty();
        }

        public static void push(int data){
            q.addLast(data);
        }

        public static int pop(){
            return q.removeLast();
        }

        public static int peek(){
            return q.peekLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
