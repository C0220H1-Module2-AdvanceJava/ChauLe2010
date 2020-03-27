import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new  Animal[2];
        animals[0] = new Cat();
        animals[1] = new Dog();
        for (Animal animal:animals) {
            animal.eat();
        }
        Animal animal = new Cat();
        System.out.println(animal.getClass());
    }
}
