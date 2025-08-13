package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    // 문제1 - 배열을 맵으로 전환
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
        Map<String, Integer> map = new HashMap<>();

        // 주어진 배열로 부터 Map 생성
        for (String[] strings : productArr) {
            map.put(strings[0], Integer.valueOf(strings[1]));
        }

        // Map의 모든 데이터 출력
        for (String key : map.keySet()) {
            System.out.println("제품: "+key+", 가격: "+map.get(key));
        }

        /*
        Set<String> keySet = map.keySet();
        Iterator<String> iterable = keySet.iterator();
        while (iterable.hasNext()) {
            String s = iterable.next();
            System.out.println("제품: "+s+", 가격: "+map.get(s));
        }
         */
    }
}
