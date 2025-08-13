package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        // InterfaceA a = new InterfaceA(); --> 코드 오류
        InterfaceA a = new Child(); // --> 부모는 자식을 닮을 수 있다. 가능
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child(); // --> 부모는 자식을 닮을 수 있다. 가능
        b.methodB();
        b.methodCommon();
    }
}
