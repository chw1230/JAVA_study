package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        // 프로그램 참여자가 바뀐다고 한다면 Constant 클래스에 가서
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    public static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if(currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        }else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
