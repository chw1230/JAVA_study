package collection.set.member;

public class MemberNoHashNoEq {

    private String id;

    // hashCode( )랑 equals( ) 없는 메서드 -> Object의 기본 메서드를 사용하게됨!!!
    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
