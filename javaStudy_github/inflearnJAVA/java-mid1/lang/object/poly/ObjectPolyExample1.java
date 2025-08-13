package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj){
        // obj.sound();  // 컴파일 오류, obj는 Object타입이므로 Object 클래스에서 찾아야함 하지만 sound()가 없다!
        // 그러면 밑에 있는 클래스인 Dog로 찾아가야하는데 Java에서는 위에 메서드로는 갈 수 있지만 아래 메서드로 가는건 메서드 오버라이딩밖에 없다!!
        // 아니면 다운 캐스팅을 해야한다!!
        // obj.move();   // 컴파일 오류, Object는 move()가 없다.


        // Object는 모든 타입의 부모다. 부모는 자식을 담을 수 있으므로 앞의 코드를 다음과 같이 할 수 있다!!!
        // Object dog = new Dog(); //Dog -> Object
        // Object car = new Car(); //Car -> Object

        // 객체에 맞는 다운 캐스팅 필요하다!!!!!!
        if (obj instanceof Dog dog){
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
