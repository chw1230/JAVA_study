package exception.basic.checked;

public class Service {
    Client client = new Client();

    // 예외를 잡하서 처리하는 코드
    public void callCatch() {
        try {
            client.call(); // 오류 폭탄이 던져졌을 때 throw  new MyCheckedException("ex");이 코드가 넘어온다고 생각 하면된다.
        } catch (MyCheckedException e) { // Exception e에서 Exception은 MyCheckedException의 부모이니까 대신해서 사용해도 됩니다!
            // 예외 처리 로직 -> 던져진 폭탄을 잡고 해결함!
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /*
    체크 예외를 밖으로 던지는 코드
    체크 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언
     */
    public void catchThrow() throws MyCheckedException{
        client.call(); // 이 코드에 오류가 있어 해결 못 한다 싶으면 밖으로 던저 버림
    }
}