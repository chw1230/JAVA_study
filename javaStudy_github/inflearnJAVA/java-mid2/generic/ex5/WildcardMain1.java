package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        WildcardEx.<Dog>printGenericV1(dogBox);
        // WildcardEx.printGenericV1(dogBox); <Dog> 생략 가능! -> 타입 추론
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.<Dog>printGenericV2(dogBox);
        // WildcardEx.printGenericV2(dogBox); <Dog> 생략 가능! -> 타입 추론
        WildcardEx.printWildcardV2(dogBox);


        Dog dog = WildcardEx.<Dog>printAndReturnGeneric(dogBox);
        // Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);

    }
}
