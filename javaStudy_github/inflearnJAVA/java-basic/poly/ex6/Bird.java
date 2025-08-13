package poly.ex6;

// 자바에서 extends를 통한 상속은 한개만 가능하고, implements를 통한 인터페이스는 여러개 가능하다.
public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 날아갑니다.");
    }
}
