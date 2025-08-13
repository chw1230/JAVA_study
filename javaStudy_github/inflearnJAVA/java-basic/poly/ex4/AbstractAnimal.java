package poly.ex4;

public abstract class AbstractAnimal {

    public abstract void sound(); // 메서드 바디가 없은 -> 호출되면 안되겠죠?
    // 추상 메서드가 하나라도 있으면 추상 클래스로 선언해야한다.
    // 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩해서 사용해야한다.

    public abstract void move();
    // 모든게 추상 메서드

    //-> 순수 추상 메서드!! 완전한 추상
}
