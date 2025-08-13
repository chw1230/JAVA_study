package Operator;

public class Operator2 {
    public static void main(String[] args) {

        // 문자열과 문자열 더하기1
        String r1 = "Hello " + "world";
        System.out.println(r1);

        // 문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result = s1 + s2;
        System.out.println(result);

        // 문자열과 숫자 더하기1
        String r3 = "a + b = " + 10;
        // 자바가 숫자를 문자열로 바꾸고("10") 값을 출력해줌
        System.out.println(r3);

        // 문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String r4 = str + num;
        System.out.println(r4);

    }
}
