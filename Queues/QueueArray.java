import java.util.*;
public class QueueArray {
    static class Queue{
        static int arr[];
        static int size ;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        //is Empty
        public static boolean isEmpty(){
            return rear == -1;
        }
        //add in queue
        public static void add(int data){
            if(rear == size-1){
                System.out.println("The queue is empty");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        //remove in the queue
        public static int remove(){
            if(isEmpty()){
                System.out.println("The queue is empty");
                return -1;
            }

            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            return front;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
