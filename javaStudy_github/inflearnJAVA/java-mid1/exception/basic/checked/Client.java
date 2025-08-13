package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{ //throws MyCheckedException -> 의미 발생시킨 예외를 밖으로 던질때 사용
        // 문제 상황 (=예외가 터짐 여기서 해결을 못 하니까 밖으로 던짐) -> call을 호출한 곳으로 던짐!!
        throw  new MyCheckedException("ex");
    }
}
