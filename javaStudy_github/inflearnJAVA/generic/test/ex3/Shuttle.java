package generic.test.ex3;

// 문제 2 제네릭 타입을 활용하여 Shuttle 클래스 만들기
public class Shuttle<T extends BioUnit> {
    private T unit;

    public void in(T t) {
        unit = t;
    }

    public T out(){
        return unit;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", " + "HP: " + unit.getHp());
    }
}
