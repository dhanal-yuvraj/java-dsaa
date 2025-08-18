import java.util.*;
public class ActivitySeletion {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct=1;
        ans.add(0);
        int lastAct = end[0];

        for(int i=1;i<end.length;i++){
            if(start[i]>=lastAct){
                maxAct++;
                ans.add(i);
                lastAct = end[i];
            }
        }

        System.out.println("The maximum activity selection is "+ maxAct);

        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
