public class oddOreven{
    public static void OddorEven(int n){
        int bitmask =1;
        if((n&bitmask)==0){
            //even
            System.out.println("Even number");
        }
        else{
            //odd
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        OddorEven(11);
        OddorEven(2);
        OddorEven(13);
    }
}