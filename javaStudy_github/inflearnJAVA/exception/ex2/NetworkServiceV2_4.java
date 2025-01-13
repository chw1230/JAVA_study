package exception.ex2;

public class NetworkServiceV2_4 {

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
        }
        // 정상 흐름은 try에 예외 흐름은 catch
        // 이런 식으로 완전 분리!

        client.disconnect(); // 이 코드는 무조건 코드 실행됨 하지만 위에 적은 것처럼 예상외의 에러가 발생하는 경우에는 아님!!
        /* 이처럼 마지막에 항상 disconnect 가 호출되어 연결 해제를 보장하는 것은 쉽지 않다! 어딘가에서 발생되는 예상하지 못한 예외들까지
        고려해야하기 때문이다. 이와 같은 구조로는 disconnect와 같은 코드 호출은 어렵다 이와 같은 문제를 해결하자!*/

    }
}