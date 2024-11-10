package final1.ex;

public class Member {
    private final String id;
    private String name;

    public Member(String id,String name){
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name){
        // this.id = id;
        System.out.println("id는 변경 불가능합니다! 이전 값과 동일하게 유지됩니다.");
        this.name = name;
    }

    public void print(){
        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }
}
