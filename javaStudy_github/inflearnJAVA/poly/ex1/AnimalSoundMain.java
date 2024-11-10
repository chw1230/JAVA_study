package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Caw caw = new Caw();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("동물 소리 시작");
        dog.sound();
        System.out.println("동물 소리 종료");

        System.out.println("동물 소리 시작");
        cat.sound();
        System.out.println("동물 소리 종료");

        soundCaw(caw);

    }

    private static void soundCaw(Caw caw){
        System.out.println("동물 소리 시작");
        caw.sound();
        System.out.println("동물 소리 종료");
    }
}
