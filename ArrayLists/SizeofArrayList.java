import java.util.*;
public class SizeofArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=5;i++){//to add 1 to 5 numbers
            list.add(i);
        }
        System.out.println(list);

        System.out.println(list.size());//for size of the list

        for(int i=0;i<list.size();i++){//to iterate and the print the elements in the array list
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
