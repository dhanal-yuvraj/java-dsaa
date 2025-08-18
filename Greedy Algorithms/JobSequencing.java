import java.util.*;
public class JobSequencing {
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int d, int p, int i){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{1,40},{1,30},{4,20},{1,10}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobsInfo.length;i++){
            jobs.add( new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit);//sorted in descending order

        ArrayList<Integer> seq = new ArrayList<>();
        

    }
}
