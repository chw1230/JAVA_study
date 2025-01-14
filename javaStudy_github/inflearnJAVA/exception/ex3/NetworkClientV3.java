package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String address; // 접속할 외부 서버 주소
    public boolean connectError; // 첨에 false 로 자동 초기화
    public boolean sendError; // 첨에 false 로 자동 초기화

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 { // 외부 서버에 연결
        if (connectError){
            // 예외를 던진다.
            throw new ConnectExceptionV3(address,address + " 서버 연결 실패" );
            // 예외 코드가 아닌 예외 그 자체로 어떤 오류가 발생 했는지 알 수 있다!!!!
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 { // 연결한 외부 서버에 데이터를 전송
        if (sendError){
            // 예외를 던진다.
            //throw new SendExceptionV3(data, address + " 서버에 데이터 전송 실패: " + data);
            // 예외 코드가 아닌 예외 그 자체로 어떤 오류가 발생 했는지 알 수 있다!!!!

            // RuntimeException 터트려보기! -> [알 수 없는 오류] 메시지: ex 발생하게됨!
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
        if (data.contains("error1")) { // data 에 error1이라는 단어가 있으면
            connectError = true;
        }
        if (data.contains("error2")) { // data 에 error2이라는 단어가 있으면
            sendError = true;
        }
    }
}
