package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        MyHashSetV2 setV2 = new MyHashSetV2(10);
        // m1, m2는 아이디가 같은 회원
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        // 해시코드는 같은 값이 출력 될 것!! --> 해시코드 메서드를 MemberOnlyHash에서 재정의 하였기 때문에!!!
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        // equals 결과 다르게(False) 나올 것임!! --> equals 메서드를 재정의하지 않았기 때문에 Object의 equals가 사용됨!!
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // 잘 못 된 것을 모르고 set에 데이터 넣기
        setV2.add(m1);
        setV2.add(m2);
        System.out.println("setV2 = " + setV2);
        // 결과를 보면 같은 id 값을 가진 데이터가 중복으로 들어 간 것을 볼 수 있음!!!! -> 잘못됨! --> equals ( ) 때문임!!!!

        // 잘 못 된 것을 모르고 검색하기
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode()); // 여기서 해시코드는 재정의해논 것을 통해 동일한 해시코드 나옴
        System.out.println("setV2.contains(searchValue) = " + setV2.contains(searchValue)); // 여기서 결국 검색 실패함!!
    }
}
