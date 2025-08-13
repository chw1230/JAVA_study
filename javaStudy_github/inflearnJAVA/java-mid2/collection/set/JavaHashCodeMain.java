package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        // 객체의 참조값을 가지고 해시코드를 만듬!!! 객체마다 참조값이 다르니까 다른 값이 나옴

        // 각 클래스마다 hashCode를 이미 오버라이딩 해두었음
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("hashCode() = " + strAB.hashCode());

        // 해시코드에 마이너스 값 들어 갈 수 있음
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까? 다를까? , 인스턴스는 다르지만 equals는 같다
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // 비교하기
        // equals, 해시코드를 오버라이딩 하지 않은 경우와 한 경우를 비교
        System.out.println("\"member1 == member2\" = " + (member1 == member2)); // 다름 인스턴스가 달라서!!!
        System.out.println("\"member1.equals(member2)\" = " + (member1.equals(member2))); // 데이터 값이 똑같기 때문에 true

        System.out.println("\"member1.hashCode()\" = " + member1.hashCode()); // 같은 값이 나옴
        System.out.println("\"member2.hashCode()\" = " + member2.hashCode()); // 같은 값이 나옴
    }
}
