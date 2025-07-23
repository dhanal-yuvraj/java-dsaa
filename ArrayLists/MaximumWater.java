import java.util.*;
class MaximumWater{

    public static int waterContainer(ArrayList<Integer> water){
        int maxWater = Integer.MIN_VALUE;
        for(int i=0;i<water.size();i++){
            for(int j=i+1;j<water.size();j++){
                int height = Math.min(water.get(i), water.get(j));
                int width = j-i;
                int maximum= height*width;
                maxWater = Math.max(maxWater,maximum );
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