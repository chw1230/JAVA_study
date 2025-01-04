package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java'"); // 기존 값을 변경하는 것이 아니라 새로운 결과를 만들어서 반환한다.
        System.out.println("str = "+ str1);
        System.out.println("str = "+ str2);
    }
}
