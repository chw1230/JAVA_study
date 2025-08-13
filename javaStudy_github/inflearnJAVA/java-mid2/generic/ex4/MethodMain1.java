package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i); // Object 타입으로 반환이 됨!
        Integer integer = (Integer) GenericMethod.objMethod(i); // 그러면 Integer로 쓰려면 다운 캐스트팅을 또 해야함!

        // 타입 인자 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10); // 숫자 이외에는 들어 갈 수 없음!
        Double  doubleValue= GenericMethod.<Double>numberMethod(10.9);// 숫자 이외에는 들어 갈 수 없음!

        System.out.println("타입 추론");
        Integer result1 = GenericMethod.genericMethod(i); // i 가 Integer임을 알 수 있으니까 <Integer> -> 생략가능!
        Integer integerValue1 = GenericMethod.numberMethod(10); // 숫자 이외에는 들어 갈 수 없음! <Integer> -> 생략가능!
        Double  doubleValue1 = GenericMethod.numberMethod(10.9);// 숫자 이외에는 들어 갈 수 없음! <Double> -> 생략가능!
    }
}
