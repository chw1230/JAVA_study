package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        // split(이걸 기준으로 나눌문자) -> 리스트에 저장
        String[] emailArr = email.split("@");
        System.out.println("ID : " + emailArr[0]);
        System.out.println("Domain : " + emailArr[1]);
    }
}
