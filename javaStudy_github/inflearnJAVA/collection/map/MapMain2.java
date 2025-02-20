package collection.map;

import java.util.HashMap;
import java.util.HashSet;

public class MapMain2 {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100); // 같은 키에 저장시 기존 값 교체
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("studentA"); // 이 키가 있니?
        System.out.println("containsKey = " + containsKey);

        // 특정 학생의 값 삭제
        studentMap.remove("studentA"); //  키를 지우면 값까지 함께 삭제됨!
        System.out.println("studentMap = " + studentMap);
    }
}
