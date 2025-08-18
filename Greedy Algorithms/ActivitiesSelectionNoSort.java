import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitiesSelectionNoSort {
    public static void main(String[] args) {
        int start[] = {1,8,0,5,5,3};
        int end[] = {2,9,6,7,9,4};

        int activity[][] = new int[start.length][3];

        for(int i=0;i<start.length;i++){
            activity[i][0] = i; // for index
            activity[i][1]= start[i];//for start
            activity[i][2]= end[i];//for end
        }

        Arrays.sort(activity,Comparator.comparingDouble(o -> o[2]));


        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct=1;
        ans.add(activity[0][0]);
        int lastAct = activity[0][2];

        for(int i=1;i<end.length;i++){
            if(activity[i][1]>=lastAct){
                maxAct++;
                ans.add(activity[i][0]);
                lastAct = activity[i][2];
            }
        }

        System.out.println("Maximum Activities ="+ maxAct);

        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }
}
