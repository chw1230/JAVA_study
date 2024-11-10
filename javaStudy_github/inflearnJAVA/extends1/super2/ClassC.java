package extends1.super2;

public class ClassC extends ClassB{

    public ClassC(){
        // ClassB에 생성자가 정의 되어있기 때문에 기본생성자 -> super();를 사용할 수 없어서
        // super(10,20);이런식으로 사용해야한다.
        super(10,20);
        System.out.println("ClassC 생성자");
    }
}
