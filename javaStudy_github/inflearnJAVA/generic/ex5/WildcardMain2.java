package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
// 하한 와일드 카드
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox);  // 하한을 제한함!! 최소한 Animal 까지만 가능해 이런 뜻!
//        writeBox(catBox); // 하한을 제한함!! 최소한 Animal 까지만 가능해 이런 뜻!

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);}

    static void writeBox(Box<? super Animal> box) { // Animal의 상위 타입만 받을 수 있다!
        box.set(new Dog("멍멍이", 100));

    }
}
