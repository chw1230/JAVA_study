package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); // 원시 타입, row type -> 타입 매개변수가 Object로 사용된다고 생각하면 된다!
        // GenericBox<Object> integerBox = new GenericBox<>(); // 권장!!
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // <> 다이아몬드 없이 선언하면 Object 타입으로 여겨진다고 생각하면됨!
        System.out.println("integer = " + integer);
        // 하지만 원시 타입을 쓴다고 하는 경우 다이아몬드 안에 <Objcet>를 넣어서 사용하자!
    }
}
