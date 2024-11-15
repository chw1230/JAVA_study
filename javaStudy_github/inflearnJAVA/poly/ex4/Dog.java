package poly.ex4;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() { // AbstractAnimal의 sound()가 abstract이니까 무조건!!! 오버라이딩 해야함
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("멍멍이가 움직입니다.");
    }
}
