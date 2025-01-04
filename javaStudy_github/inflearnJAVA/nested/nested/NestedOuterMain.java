package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter(); // 그냥 만든 것
        NestedOuter.Nested nested = new NestedOuter.Nested(); // new 바깥클래스.중첩클래스() 로 생성
        nested.print();
        System.out.println("nestedClass = " + nested.getClass());
    }
}
