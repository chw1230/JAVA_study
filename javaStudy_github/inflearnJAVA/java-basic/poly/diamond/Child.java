package poly.diamond;
// 다중구현 !!!
public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override // 구현은 하나만
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
