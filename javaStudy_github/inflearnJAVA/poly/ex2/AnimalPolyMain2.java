package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cow cow = new Cow();
        Cat cat = new Cat();
        Duck duck = new Duck();
        Animal[] animalArr = {dog, cat, cow,duck};

        // 동물이 추가되어도 변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 시작");
            animal.sound();
            System.out.println("동물 소리 종료");
        }
    }
}
