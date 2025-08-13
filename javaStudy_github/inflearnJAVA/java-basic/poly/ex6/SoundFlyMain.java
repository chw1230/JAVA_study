package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Bird bird = new Bird();

        soundAnimal(dog);
        soundAnimal(chicken);
        soundAnimal(bird);

        dog.move();
        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 종료");
    }

    //Fly 인터페이스가 있으면 사용가능!
    private static void flyAnimal(Fly fly){
        System.out.println("날기 가능!");
        fly.fly();

    }
}
