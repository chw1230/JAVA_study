package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력 -> 객체의 이름(클래스에 대한 정보) + 객체의 참조값(해시코드)
        System.out.println(string);

        // object 직접 출력
        System.out.println(object);

    }
}
