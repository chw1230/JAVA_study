package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        // m1, m2는 아이디가 같은 회원
        Member m1 = new Member("A");
        Member m2 = new Member("A");

        // 해시코드는 같은 값이 출력 될 것!! --> 해시코드 메서드를 MemberOnlyHash에서 재정의 하였기 때문에!!!
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        // equals 결과 같게(True) 나올 것임!! --> equals 메서드를 재정의하지 하였기 때문에!!
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // set에 데이터 넣기
        set.add(m1);
        set.add(m2);
        System.out.println("setV2 = " + set);
        // 결과를 보면 같은 id 값을 가진 데이터가 중복이 아닌 하나의 값만 들어간 것을 볼 수 있음

        // 검색하기
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode()); // 여기서 해시코드는 재정의해논 것을 통해 동일한 해시코드 나옴
        System.out.println("setV2.contains(searchValue) = " + set.contains(searchValue)); // 검색 성공
    }
}
