package collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {

    private String id;

    public MemberOnlyHash(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    // 해시코드 메서드만 있는 경우!!!!!!!
    @Override
    public int hashCode() {
        return Objects.hash(id); // ID를 기반으로 해시코드 생성
    }

    @Override
    public String toString() {
        return "MemberOnlyHash{" +
                "id='" + id + '\'' +
                '}';
    }
}
