public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //Creating the pen object
        p1.SetColor("Blue");
        System.out.println(p1.color);
        p1.SetTip(20);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color ;
    int tip;
    void SetColor(String newColor){
        color = newColor;
    }
    void SetTip(int newTip){
        tip = newTip;
    }
}
