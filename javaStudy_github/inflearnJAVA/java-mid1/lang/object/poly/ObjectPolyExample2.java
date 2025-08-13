package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object};

        size(objects); // alt + enter -> 메서드 만들어줌
    }

    // java를 사용하는 모든 코드에서 사용가능!
    private static void size(Object[] objects) {
        System.out.println("객체의 수는 : "+objects.length);
    }
}
