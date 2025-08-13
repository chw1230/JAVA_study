package lang.immutable.change;

public class ImmutableMain1 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        // 계산 이후에도 신규 값과 기존값 모두 확인 가능
        // 서로 다른 두 객체에 저장 되어 있는 값이기 때문에
        System.out.println("obj1 = "+obj1.getValue());
        System.out.println("obj2 = "+obj2.getValue());
    }
}
