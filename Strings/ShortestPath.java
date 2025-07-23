public class ShortestPath {
    public static float findShortest(String dir){
        int x=0;
        int y=0;
        for(int i=0;i<dir.length();i++){
            int flow = dir.charAt(i);
            if(flow == 'N'){
                y++;
            }
            else if(flow == 'S'){
                y--;
            }
            else if(flow == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(findShortest(str));
    }
}
