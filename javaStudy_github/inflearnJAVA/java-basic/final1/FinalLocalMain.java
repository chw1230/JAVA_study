package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; //컴파일 오류

        //final 지역 변수 2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류
    }

    static void method(final int parameter){
        //parameter = 20; 매개변수로 들어온 값을 바꿀 수 없음!! -> final 때문에!!
    }
}
