package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue(); // ~~.add()는 계속 자기 자신의 주소를 반환하니까
        // 체인처럼 연결되어 있는 보습을 볼 수 있음!
        System.out.println("result = " + result);
    }
}
