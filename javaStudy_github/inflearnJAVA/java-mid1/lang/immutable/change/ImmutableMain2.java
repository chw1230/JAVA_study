package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);
        // add는 새로운 객체의 주소를 리턴해주는데 값이 변할 리가 없지!!!!

        System.out.println("obj1 = "+obj1.getValue());
    }
}
