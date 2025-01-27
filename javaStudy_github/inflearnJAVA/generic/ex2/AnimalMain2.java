package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);

        // animal에 cat과 dog가 들어갈 수 있음(상속이용!)을 이용!!!!!!!
        animalBox.set(cat);
        Animal animal1 = animalBox.get();
        System.out.println("animal1 = " + animal1);

        animalBox.set(dog);
        Animal animal2 = animalBox.get();
        System.out.println("animal2 = " + animal2);
    }
}
