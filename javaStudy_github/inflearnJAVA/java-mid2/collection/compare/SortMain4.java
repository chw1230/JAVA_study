package collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = new ArrayList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null); // 이렇게 하면 MyUser가 가진 기본 정렬인 나이순으로 정렬이 됨!
        // Collections.sort(list); // 이런 방법도 있음 -> 비추천 윗줄 코드 작성
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator()); // 이렇게 하면 MyUser의 id 기반의 정렬이 됨!
        // Collections.sort(list,new IdComparator()); // 이런 방법도 있음 -> 비추천 윗줄 코드 작성
        System.out.println(list);

    }


}
