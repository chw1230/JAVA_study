package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메소드 호출 전: a = " + a);
        changePrimitive(a);
        // a 자체를 넘겨주는 것이 아니라 a속 값 자체를 전달하는 것임!!
        System.out.println("메소드 호출 전: a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
