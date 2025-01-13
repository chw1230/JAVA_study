package exception.ex2;

public class NetworkClientV2 {

    private final String address; // 접속할 외부 서버 주소
    public boolean connectError; // 첨에 false로 자동초기화
    public boolean sendError; // 첨에 false로 자동초기화

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 { // 외부 서버에 연결
        if (connectError){
            // 예외를 던진다.
            throw new NetworkClientExceptionV2("connectError",address + " 서버 연결 실패" );
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 { // 연결한 외부 서버에 데이터를 전송
        if (sendError){
            // 예외를 던진다.
            // throw new NetworkClientExceptionV2("sendEorror", address + " 서버에 데이터 전송 실패: " + data);
            // 중간에 다른 예외가 발생했다고 가정하고 밑에 코드가 실행된다면
             throw new RuntimeException("ex");
        }

        // 전송 성공
        System.out.println(address + " 서버 data 전송: " + data);
    }

    public void disconnect() { // 외부 서버와 연결을 해제
        System.out.println(address + " 서버 연결 해제 ");
        return;
    }

    public void initError(String data) {
        if (data.contains("error1")) { // data에 error1이라는 단어가 있으면
            connectError = true;
        }
        if (data.contains("error2")) { // data에 error2이라는 단어가 있으면
            sendError = true;
        }
    }
}
