package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T PrintAndReturn(T t) { // 제네릭 메서드꺼에 우선순위를 가진다!
        System.out.println("animal.className = " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }
}
