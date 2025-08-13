package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) { // 복잡한 NetworkClient 사용 로직을 처리
        String address = "http://example.com"; // 접속할 외부 서버 주소도 함께 전달한다.
        NetworkClientV0 client = new NetworkClientV0(address); // NetworkClient를 생성

        // 전체 적인 흐름을 NetworkService의 sendMessage에서 관리
        client.connect();
        client.send(data);
        client.discount();
    }
}
