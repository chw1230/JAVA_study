package exception.ex1;

public class NetworkClientV1 {

    private final String address; // 접속할 외부 서버 주소
    public boolean connectError; // 첨에 false로 자동초기화
    public boolean sendError; // 첨에 false로 자동초기화

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect(){ // 외부 서버에 연결
        if (connectError){
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) { // 연결한 외부 서버에 데이터를 전송
        if (sendError){
            System.out.println(address + " 서버에 데이터 전송 실패: " + data);
            return "sendError";
        }

        // 전송 성공
        System.out.println(address + " 서버 data 전송: " + data);
        return "success";
    }

    public void disconnect() { // 외부 서버와 연결을 해제
        System.out.println(address + " 서버 연결 해제 ");
        return;
    }

    public void intiError(String data) {
        if (data.contains("error1")) { // data에 error1이라는 단어가 있으면
            connectError = true;
        }
        if (data.contains("error2")) { // data에 error2이라는 단어가 있으면
            sendError = true;
        }
    }


}
