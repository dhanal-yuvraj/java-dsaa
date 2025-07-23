public class ClearLastBits {
    public static int ClearBits(int n,int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ClearBits(15, 2));
    }
}
