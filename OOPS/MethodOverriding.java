public class MethodOverriding {
    public static void main(String[] args) {
    Deer d1 = new Deer();
    d1.eats();    
    }
}

class Animal{
    int weight;

    void eats(){
        System.out.println("Eating the food");
    }
    void breathe(){
        System.out.println("Breathe the air");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("Eats Grass");
    }
}
