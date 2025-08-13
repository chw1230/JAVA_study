package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);

//        Object object = new ObjectBox().get();
//        Integer integer = (Integer) object;
//        // ctrl + alt + shift + t 누르고 Inline variable 누르면 object 변수들 끼리 합쳐져서 개꿀임!

        Integer integer = (Integer) integerBox.get(); // 다운캐스팅 Object -> Integer
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // 다운캐스팅 Object -> String
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달로 인해 타입이 맞지 않는 경우!
        integerBox.set("문자100"); // set으로 넣을 때 문제 발생하지 않음 Object로 받아 내기 때문에
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외 발생함! (ClassCastException)
        System.out.println("result = " + result); // -> 오류 발생

        /*
        다형성을 이용하여 코드 재사용이 가능해졌지만 타입 안전성이 떨어지(뭐가 튀어나올지 몰라서 다운캐스팅을 해야하는)는 문제가 발생하게되었다!
        코드 재사용(다형성)과 타입 안정성 두가지를 모두 잡을 수 있는 방법은 ? ===> 제네릭! 이다!
         */

    }
}
