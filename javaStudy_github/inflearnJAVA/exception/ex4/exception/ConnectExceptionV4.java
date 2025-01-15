package exception.ex4.exception;


// 연결 실패시 발생하는 예외
public class ConnectExceptionV4 extends NetworkClientExceptionV4 {
    // 내부에 연결을 시도한 address 보관
    private  final String address;

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
