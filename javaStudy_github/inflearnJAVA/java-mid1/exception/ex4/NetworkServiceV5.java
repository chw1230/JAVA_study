package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) { // 언체크 이므로 throws를 사용하지 않음!
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)) { // client 변수는 try 안에서만 사용할 수 있음!
            // 하나의 try 흐름에 정상 흐름을 담아버리기!
            client.initError(data); // 에러 초기화!!
            client.connect();
            client.send(data);
            // 여기서 try가 끝나면(또는 try를 빠져나가면!!!!! 빠져나간다는 것이 catch던 finally던 상관없음!!!!!) close( ) 메서드가 바로 실행이됨!!!!!
            // implements AutoCloseable 한 것에 의해서!!
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
        // 그래서 이 자리에 있던 disconnect 도 있을 필요가 없음!!!! try 끝나면 실행되는 close( ) 메서드에
        // disconnect를 넣어놨기 때문에
        }
}