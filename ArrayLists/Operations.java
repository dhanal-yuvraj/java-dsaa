import java.util.*;
public class Operations {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();


        //adding in the list
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get operation in the list
        int element= list.get(2);
        System.out.println(element);

        //remove operation
        list.remove(1);
        System.out.println(list);

        //set operation
        list.set(1,7);
        System.out.println(list);

        //contains operation
        boolean contain=list.contains(1);
        System.out.println(contain);

        //add at index
        list.add(1,9);
        System.out.println(list);
    }
}
