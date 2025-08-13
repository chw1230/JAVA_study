package generic.test.ex4;

import generic.animal.Animal;

public class AnimalMethod {

    public static <T extends Animal>void checkup(T t){ // T에 들어 갈 수 있는 것을 Animal이나 Animal의 자식으로 제한하여 사용할 수 있도록 바꿈
        System.out.println("동물 이름 : " + t.getName());
        System.out.println("동물 크기 : " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T bigger(T t1,T t2) { // T에 들어 갈 수 있는 것을 Animal이나 Animal의 자식으로 제한하여 사용할 수 있도록 바꿈
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
