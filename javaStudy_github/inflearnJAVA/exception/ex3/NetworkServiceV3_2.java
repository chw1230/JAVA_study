package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); // 에러 초기화!!


        try {
            // 하나의 try 흐름에 정상 흐름을 담아버리기!
            client.connect();
            client.send(data); // SendExceptionV3 발생 -> ConnectException 에 들어가지 않음! -> NetworkClientExceptionV3에는 담겨서 들어갈 수 있음!
        }catch (ConnectExceptionV3 e) { // 중요해서 남겨둘거야!
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
            // 각각의 예외 클래스가 가지는 고유의 기능을 사용할 수 있다.
        } catch (NetworkClientExceptionV3 e) { // 연결오류를 제외한 나머지 오류는 그냥 퉁치자 단숭 오류라고 출력할거야!
            System.out.println("[네트워크 오류] 메시지: "+e.getMessage());
        } catch (Exception e){ // RuntimeException 같은 것들이 여기에 걸려!
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        }finally {
            client.disconnect();
        }
        // catch의 순서도 매우 중요함!! 디테일한 예외를 먼저 잡고 부모로 가는 예외들을 밑으로 주르륵 코딩한다!


        //  예외를 한번에 잡는 방법
        /*catch(ConnectExceptionV3 | SendExceptionV3 e){
            System.out.println("[연결 또는 전송 오류] 주소: , 메시지: " + e.getMessage());
            // 단점 존재 ConnectException의 변수 address를 사용할 수 없음 (사용은 가능하나 send 오류가 나는 경우에는 에러 발생!)
            // data도 마찬가지! (사용은 가능하나 connect 오류가 발생하면 error가 발생한다!)
        }*/


    }
}