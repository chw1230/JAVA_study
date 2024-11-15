package poly.ex4;

public class Cow extends AbstractAnimal {
    @Override
    public void sound() { // AbstractAnimal의 sound()가 abstract이니까 무조건!!! 오버라이딩 해야함
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소가 움직입니다.");
    }
}
