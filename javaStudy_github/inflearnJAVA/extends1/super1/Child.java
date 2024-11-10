package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("child.hello");
    }

    public void call(){
        System.out.println("this value = "+this.value); // 내 타입에서 찾기
        System.out.println("super value = "+super.value); // 부모 타입에서 찾기
        this.hello(); // this 생략가능
        super.hello();
    }
}
