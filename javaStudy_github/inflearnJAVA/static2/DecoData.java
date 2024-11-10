package static2;

public class DecoData {

    public int instanceValue;
    public static int staticValue;

    public static void staticCall(){
        // instanceValue++; 인스턴스 변수에 접근 ---> 오류 발생
        // instanceMethod(); 인스턴스 메서드에 접근 ---> 오류 발생

        staticValue++; // 정적 변수에 접근
        staticMethod(); // 정적 메서드에 접근
    }
    // 정리하면 ststic은 ststic만 접근 가능

    public void instanceCall() {
        instanceValue++; //인스턴스 변수에 접근
        instanceMethod(); //인스턴스 메서드에 접근

        DecoData.staticValue++; // 정적 변수에 접근 <같은 클래스라서 DecoData 생략가능!!!!>
        staticMethod(); // 정적 메서드에 접근 생략한 경우
    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }
    // 참조값을 매개변수로 넘겨줘서 접근하는 것은 문제가 되지 않는다!!!!


    public void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    public static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
