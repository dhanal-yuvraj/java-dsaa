import java.util.*;
public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 5; i++) {
            list.add(i);
        }

        for(int j = list.size() - 1; j >= 0; j--) {
            System.out.print(list.get(j) + " ");
        }
    }
}
