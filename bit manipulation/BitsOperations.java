public class BitsOperations {
    public static void getIthBit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            //The ith bit is 0
            System.out.println("0");
        }
        else{
            //The ith bit is 1
            System.out.println("1");
        }
    }

    public static int SetBit(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int ClearIthBit(int n,int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static int UpdateIthBit(int n,int i,int newBit){
        n= ClearIthBit(n,i);
        int bitmask = newBit<<i;
        return n|bitmask;
    }
    public static void main(String[] args) {
        //10 = 1010
        getIthBit(10, 3);
        System.out.println(SetBit(10, 2));
        System.out.println(ClearIthBit(10, 1));
    }
}
