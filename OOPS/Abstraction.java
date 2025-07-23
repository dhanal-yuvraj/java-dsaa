public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eats();
        h.walk();

        Chicken c = new Chicken();
        c.eats();
        c.walk();
    }
}

abstract class Animal{
    void eats(){
        System.out.println("Eating...");
    }
    abstract void walk();
}

class Horse extends Animal{
    void eats(){
        System.out.println("Horse eating grass");
    }
    void walk(){
        System.out.println("Horse walk in 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walks in 2 legs");
    }
}
