package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat("java'");
        System.out.println("str = "+ str);
        // concat을 했는데 값이 똑같음 -> concat이 리텅 값이 있어서 그럼!
    }
}
