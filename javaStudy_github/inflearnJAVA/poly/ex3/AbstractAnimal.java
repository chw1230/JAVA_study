package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); // 메서드 바디가 없음 -> 호출되면 안되겠죠?
    // 추상 메서드가 하나라도 있으면 추상 클래스로 선언해야한다.
    // 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩해서 사용해야한다.

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
