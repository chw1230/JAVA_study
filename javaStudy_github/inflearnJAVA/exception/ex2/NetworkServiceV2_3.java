package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 에러 초기화!!


        try {
            // 하나의 try 흐름에 정상 흐름을 담아버리기!
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: "+e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
        // 정상 흐름은 try에 예외 흐름은 catch
        // 이런 식으로 완전 분리!
    }
}