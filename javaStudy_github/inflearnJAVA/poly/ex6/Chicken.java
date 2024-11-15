package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void fly() {
        System.out.println("닭이 날아갑니다.");
    }
    @Override
    public void sound() {
        System.out.println("뽝뽝");
    }
}
