package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 비제한 와일드 카드
    // Box<Dog>, Box<Cat>, Box<Object> ?에 3개가 다 들어갈 수 있음
    // 이렇게 ?만 사용해서 제한 없이 모든 타입을 다 받을 수 있는 와일드카드를 비제한 와일드카드라 한다.
    static void printWildcardV1(Box<?> box) {
        System.out.println("w.c / ? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) { // T에 상한(제한)을 걸어둠 T에는 animal이 들어옴!
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    // 상한 와일드 카드
    static void printWildcardV2(Box<? extends Animal> box) { // 와일드카드 값에 들어오는 것을 제한할 수 있음 이런 와일드 카드를 상한 와일드 카드라고 한다
        Animal animal = box.get(); // 그래서 제한 해둔 Animal 타입으로 반환값을 받는 것이다!
        System.out.println("w.c / 이름 = " + animal.getName());
    }


    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        // 이 코드의 아쉬운 점 제네리 메서드와 다르게 반환타입을 동적으로 바꾸거나 할 수 없다!!
        // 제너릭 메서드에서 Box<Dog> 였다면 Dog 타입으로 반환이 되겠지만
        // 와일드 카드에서는 제한 해둔 것에서 타입을 가져와 사용하기 때문에 반환된 부모 타입에 대해서 다운캐스팅을 진행해야하느 경우가 생긴다!
        Animal animal = box.get();
        System.out.println("w.c / 이름 = " + animal.getName());
        return animal; // ?에 들어온 타입으로 반환할 수 없다!!
    }

    // 그렇다면 기존의 코드와의 차이점은 무엇인가?
    // 와일드카드 코드는 기존 제네릭 메서드를 정의할 때 사용하는 것이 아니라 제네릭 타입을 전달 받아서 활용할 때 사용하는 것!
}
