package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) { // 복잡한 NetworkClient 사용 로직을 처리
        String address = "http://example.com"; // 접속할 외부 서버 주소도 함께 전달한다.
        NetworkClientV1 client = new NetworkClientV1(address); // NetworkClient를 생성
        client.intiError(data); // 에러 초기화!!

        // 전체 적인 흐름을 NetworkService의 sendMessage에서 관리
        // connect( ) 메서드가 연결 상태를 반환하는 것을 볼 수 있음! 그렇다면 반환값을 받을 수 있는 친구 만들어주기!!!
        String connectResult = client.connect();
        if (isError(connectResult)) { // 결과가 성공이 아니라면 -> 오류라면!!!
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            // send( ) 메서드가 연결 상태를 반환하는 것을 볼 수 있음! 그렇다면 반환값을 받을 수 있는 친구 만들어주기!!!
            String sendResult = client.send(data);
            if (isError(sendResult)) { // 결과가 성공이 아니라면 -> 오류라면!!!
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        client.disconnect(); // 조건문을 지나서 마지막에 항상 disconnect() 가 실행되도록 구성!
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
