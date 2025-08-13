package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 에러 초기화!!


        try {
            // 하나의 try 흐름에 정상 흐름을 담아버리기!
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) { // RuntimeException("ex") -> 이것과 같은 예외는 잡을 수 없음(내가 모르는 예외가 오면 잡을 수 없다는 단점 발생!) 언체크 예외라서 그냥 못잡아서 밖으로 쭉쭉쭉 던져저 버림 그래서 disconnect메서드 호출 불가능
            System.out.println("[오류] 코드: "+e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {// 반드시 호출해야하는 마무리 흐름! 정상이 끝나도! catch에서 잡아도! catch에서 잡지 못하느 에외가 발생해도! 무조건 실행!
            // 보통 try에서 사용한 자원을 해제할 때 주로 사용한다!
            client.disconnect();
            // testCase 1 -> RuntimeException("ex"); 와 같은 예외가 발생한 경우에는 catch에서 잡지못하고 finally를 수행하고 밖으로 나간다!!
        }
        // 정상 흐름은 try / 예외 흐름은 catch / 무조건 싱행해야하는 마무리 흐름은 finally
        // 이런 식으로 완전 분리!
    }
}