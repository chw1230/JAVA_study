package generic.test.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고냥이", 100);

        /* 타입 매개변수 추론 사용할 수 있으니까 제네릭 삭제해도 됨!
        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.<Cat>checkup(cat);
        AnimalMethod.<Dog>bigger(dog, targetDog);
         */
        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 600);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
