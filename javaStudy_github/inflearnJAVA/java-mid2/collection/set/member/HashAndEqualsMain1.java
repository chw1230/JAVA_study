package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        MyHashSetV2 setV2 = new MyHashSetV2(10);
        // m1, m2는 아이디가 같은 회원
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");

        // 해시코드는 다른 값이 출력 될 것!! -> Object의 기본 해시코드 메서드를 사용하므로 다른 참조값을 가지는 m1,m2의 해시 코드는 다른 값이 나옴
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        // equals 결과도 다르게(False) 나올 것임!!
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // 잘 못 된 것을 모르고 set에 데이터 넣기
        setV2.add(m1);
        setV2.add(m2);
        System.out.println("setV2 = " + setV2);
        // 결과를 보면 같은 id 값을 가진 데이터가 중복으로 들어 간 것을 볼 수 있음!!!! -> 잘못됨!

        // 잘 못 된 것을 모르고 검색하기
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode()); // 여기서 또 다른 해시코드가 나옴
        System.out.println("setV2.contains(searchValue) = " + setV2.contains(searchValue)); // 여기서 결국 검색 실패함!!
    }
}
