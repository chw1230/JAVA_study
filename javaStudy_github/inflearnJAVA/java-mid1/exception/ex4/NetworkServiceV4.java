package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) { // 언체크 이므로 throws를 사용하지 않음!
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); // 에러 초기화!!


        try {
            // 하나의 try 흐름에 정상 흐름을 담아버리기!
            client.connect();
            client.send(data);
        }finally {
            client.disconnect();
        }
        // 해당 예외들은 모두 개발자가 복구할 수 없는 예외들이다! 그러므로 예외들을 잡지않고 다른 곳에서 한번에 처리하게한다.
    }
}