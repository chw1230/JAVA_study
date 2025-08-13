package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cow cow = new Cow();
        Cat cat = new Cat();
        Duck duck = new Duck();
        // Animal은 부모이고, Dog,Cat,Caw들은 자식이기 때문에 부모는 자식을 품을 수 있다는
        // 규칙에 따라서 가능하다!

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }

    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 시작");
        animal.sound(); //여기서 animal.sound()를 해도 Animal의 sound가 나오는 것이 아니라
        // 각 동물의 sound()가 나오는 이유는
        // 메서드 오바라이딩 된 아이들이 더 우선적이기 때문이다!!! -> 다형성 1에서 공부함!!
        System.out.println("동물 소리 종료");
    }
}
