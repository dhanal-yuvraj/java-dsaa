public class HieraricalInheritance {
    public static void main(String[] args) {
        Fish betta = new Fish();
        Mammal human = new Mammal();
        Bird crow = new Bird();

        betta.eats();
        human.eats();
        crow.eats();
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

class Mammal extends Animal{
    void walk(){
        System.out.println("Walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swimming");
    }
}
