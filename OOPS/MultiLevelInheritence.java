public class MultiLevelInheritence {
    public static void main(String[] args) {
        Dog don = new Dog();
        don.eats();
        don.legs = 4;
        System.out.println(don.legs);
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
    int legs;
}

class Dog extends Mammal{
    int breed;
}
