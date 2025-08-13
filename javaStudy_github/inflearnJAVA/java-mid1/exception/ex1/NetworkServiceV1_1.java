package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) { // 복잡한 NetworkClient 사용 로직을 처리
        String address = "http://example.com"; // 접속할 외부 서버 주소도 함께 전달한다.
        NetworkClientV1 client = new NetworkClientV1(address); // NetworkClient를 생성
        client.initError(data); // 에러 초기화!!

        // 전체 적인 흐름을 NetworkService의 sendMessage에서 관리
        client.connect();
        client.send(data);
        client.disconnect();
    }
}