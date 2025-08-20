package thread.bounded;

public interface BoundedQueue { // 버퍼 역할을 하는 큐의 인터페이스
    void put(String data); // 버퍼에 데이터 보관

    String take(); // 버퍼에 보관된 값 가져가기
}