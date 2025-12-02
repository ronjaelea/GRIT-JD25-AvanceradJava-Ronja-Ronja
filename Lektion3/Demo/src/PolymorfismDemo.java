public class PolymorfismDemo {

    public static void Demo() {
        Animal mysteryAnimal1 = new Dog();
        Animal mysteryAnimal2 = new Fox();

        // Subtyping (polymorfism) - avgörs vid körning (dynamic dispatch)
        mysteryAnimal1.makeSound();
        mysteryAnimal2.makeSound();

        mysteryAnimal1.eat();
        mysteryAnimal2.eat("peanuts");
    }

}

class Animal {

    void makeSound() {
        System.out.println("Some animal sound!");
    }

    void eat() {
        System.out.println("Eating!");
    }

    void eat(String food) {
        System.out.println("Eating " + food);
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woff, woff!");
    }
}

class Fox extends Animal {
    @Override
    void makeSound() {
        System.out.println("?");
    }
}