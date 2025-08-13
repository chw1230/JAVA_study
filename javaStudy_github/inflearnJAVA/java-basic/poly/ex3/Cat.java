package poly.ex3;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() { // AbstractAnimal의 sound()가 abstract이니까 무조건!!! 오버라이딩 해야함
        System.out.println("야옹");
    }
}
