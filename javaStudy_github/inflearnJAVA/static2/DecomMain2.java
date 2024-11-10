package static2;

public class DecomMain2 {
    public static void main(String[] args) {
        String s = "Hello";
        String deco = DecoUtil2.deco(s);
        // 인스턴스를 생성하지않고 클래스에 접근해서 메서드 호출함
        // 정적 메서드, 클래스 메서드 라고 한다.

        // static이 붙지 않은 메서드들은 인스턴스 메서드라고 한다.

        System.out.println("befor : "+s);
        System.out.println("after : "+deco);
    }
}
