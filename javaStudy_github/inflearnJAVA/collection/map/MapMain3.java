package collection.map;

import java.util.HashMap;

public class MapMain3 {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        // 학생이 없는 경우에만 데이터를 추가
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가하는 것을 편하게!! -> putIfAbsent 사용
        studentMap.putIfAbsent("studentA", 100); // putIfAbsent( K , V ) -> K가 없는 경우에만 V를 추가! 그래서 이 코드는 실행 X
        studentMap.putIfAbsent("studentB", 100); // putIfAbsent( K , V ) -> K가 없는 경우에만 V를 추가!
        System.out.println(studentMap);
    }
}
