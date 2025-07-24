import java.util.*;

public class Lonely {

    public static ArrayList<Integer> lonelyArray(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            boolean isLonely = true;

            for (int j = 0; j < numbers.size(); j++) {
                if (i == j) continue; // skip self

                int compare = numbers.get(j);
                if (compare == current - 1 || compare == current + 1) {
                    isLonely = false;
                    break;
                }
            }

            if (isLonely) {
                result.add(current);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(6);
        arr.add(5);
        arr.add(8);

        ArrayList<Integer> lonely = lonelyArray(arr);
        System.out.println("Lonely numbers: " + lonely);
    }
}
