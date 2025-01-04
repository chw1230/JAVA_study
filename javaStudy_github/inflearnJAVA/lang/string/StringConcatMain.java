package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String r1 = a.concat(b);
        String r2 = a + b;
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}
