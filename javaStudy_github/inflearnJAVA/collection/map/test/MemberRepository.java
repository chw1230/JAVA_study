package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    // 문제6 - 회원 관리 저장소
    private Map<String, Member> memberMap = new HashMap<>();

    // 회원 저장
    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    // 회원 삭제
    public void remove(String id) {
        memberMap.remove(id);
    }

    // id로 회원 조회
    public Member findById(String id) {
        return memberMap.get(id);
    }

    // name으로 회원 조회
    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}
