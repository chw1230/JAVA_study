package exception.basic.unchecked;

public class Client {
    public void call(){ // throws 적을 필요가 없어요!!!!!! 생략가능!!
        throw new MyUncheckedException("ex");
    }
}
