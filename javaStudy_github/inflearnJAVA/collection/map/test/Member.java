package collection.map.test;

// 문제6 - 회원 관리 저장소
public class Member {
    private String id;
    private String name;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
