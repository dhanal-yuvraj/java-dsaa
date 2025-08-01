public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add first in doubly linked list
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //add last in doubly linked list
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail= newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;

        }

        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
    }

    //print the double linked list
    public void print(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.print();
    }
}
