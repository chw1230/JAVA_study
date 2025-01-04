package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // 참조에 접근하여 값을 전달!  이전의 static(클래스에 접근)과 다름!
        // 바깥 클래스에 대한 정보가 있어야 접근이 가능함!!! 바깥 클래스가 정의 되어 있지 않다면 위의 코드도 있을 수 없음!!
        inner.print();
        System.out.println("innerClass()  = " + inner.getClass() );
    }
}
