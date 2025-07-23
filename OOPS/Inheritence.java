public class Inheritence{
    public static void main(String[] args) {
        Fish betta = new Fish();
        betta.eats();
        betta.swim();
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

class Fish extends Animal{
    int fin;
    void swim(){
        System.out.println("The fish can swim in water");
    }
}