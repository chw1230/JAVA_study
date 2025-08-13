package Operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean r1 = "hello".equals("hello");
        boolean r2 = str1.equals("문자열1");
        boolean r3 = str1.equals(str2);

        System.out.println(r1);
        System.out.println(r2);// ctrl + shift + enter --> 세미콜론 자동 추가 기능
        System.out.println(r3);
    }
}
