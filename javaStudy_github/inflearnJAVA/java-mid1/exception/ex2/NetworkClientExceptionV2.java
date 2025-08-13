package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{

    private String errorCode; // 예외 안에 오류코드를 보관하도록 만들었음

    public NetworkClientExceptionV2(String errorCode, String message) { // 에러 코드와 메시지를 받기
        super(message); // 오류 메시지는 상위 클래스인 Throwable에서 기본으로 제공하는 기능사용
        this.errorCode = errorCode;
    }

    public String getErrorCode() { // 에러코드를 얻을 수 있도록 getter 만들기
        return errorCode;
    }
}
