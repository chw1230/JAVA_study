package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod(); // Child가 Parent 상속 받았기 때문에 가능!!
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        // 다형적 참조
        Parent poly = new Child(); // 부모타입은 자식을 참조할 수 있음 => 부모는 자식을 담을 수 있다.
        poly.parentMethod();

        // Child child1 = new Parent(); // 자식은 부모를 담을 수 없다.
        // poly.ChildMethod(); / poly는 Parent 타입이므로 ChildMethod()에 접근할 수 없음!!! -> 자식의 기능은 호출할 수 없다.
    }
}
