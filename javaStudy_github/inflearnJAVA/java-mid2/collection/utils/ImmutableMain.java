package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        // 불편 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        // 가변 리스트로 바꾸기
        ArrayList<Integer> mutableList = new ArrayList<>(list); // ( ) 안에 불변 객체를 넣을 수 있음!
        // 넣은 불변 객체를 토대로 객체 다시만들기!!!!
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);

        // 불변 리스트로 바꾸기
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);

        // unmodifiableList.add(5); 값을 넣으면 오류발생 값을 넣지 못하는 불변객채로의 변환 완료
//      java.lang.UnsupportedOperationException;

    }
}
