import java.util.*;

public class MaximumWaterTwoPointers {

    public static int waterContainer(ArrayList <Integer> water){
        int maxWater = Integer.MIN_VALUE;
        int lp = 0;
        int rp = water.size()-1;
        while(lp < rp){
            int height = Math.min(water.get(rp), water.get(lp));
            int width = rp-lp;
            int currWater = height*width;
            maxWater = Math.max(currWater,maxWater);

            if(water.get(rp)<water.get(lp)){
                rp--;
            }else{
                lp++;
            }

        }
        return maxWater;
    }
      public static void main(String[] args) {
        ArrayList <Integer> water = new ArrayList<>();
        water.add(1);
        water.add(8);
        water.add(6);
        water.add(2);
        water.add(5);
        water.add(4);
        water.add(8);
        water.add(3);
        water.add(7);
        int ans = waterContainer(water);
        System.out.println(ans);

    }
}
