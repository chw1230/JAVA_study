package poly.ex4;


public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스 생성 불가!!
        // AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 움직임 시작");
        animal.move();
        System.out.println("동물 움직임 종료");
    }
}
