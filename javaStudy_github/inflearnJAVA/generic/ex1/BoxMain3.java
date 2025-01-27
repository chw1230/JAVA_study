package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입이 Integer로 결정됨!!
        integerBox.set(10);
        // 만약 integerBox.set("문자 100"); --> 빨간줄 생기면서 컴파일 오류가 발생한다!
        Integer integer = integerBox.get(); // Integer 타입 반환(캐스팅 필요 없음!!)
        System.out.println("integer = " + integer);

        GenericBox<String> StringBox = new GenericBox<String>(); // 생성 시점에 T의 타입이 Integer로 결정됨!!
        StringBox.set("hello");
        String string = StringBox.get();// String 타입 반환(캐스팅 필요 없음!!)
        System.out.println("string = " + string);

        // 원하는 타입 모두 다 가능!
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double aDouble = doubleBox.get();
        System.out.println("aDouble = " + aDouble);

        /*
        < > 사이에 원하는 타입을 지정한다!
        클래스를 생성하는 시점( new ~~~ ) 에 타입을 결정해서 사용한다!

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>(); 뒤에 있는 다이아몬드<> 안에 있는 타입은 생략 가능!!

        제네릭을 통해서 코드 재사용과 타입 안정성이라는 두마리 토끼 잡을 수 있음!!
         */


    }
}
