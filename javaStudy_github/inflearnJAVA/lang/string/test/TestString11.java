package lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        // 메서드 체이닝 사용!
        StringBuilder builder = new StringBuilder().append(str).reverse();
        System.out.println(builder);
    }
}
