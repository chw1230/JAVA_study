package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myid","choi");
        member.print();
        member.changeData("myid2","choi");
        member.print();
    }
}
