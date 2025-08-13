package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int index = str.indexOf(key);
        int cnt = 0;
        // indexOf(찾을거);
        // indexOf(찾을거,어디서부터?);
        // indexOf( ) 메서드가 찾는 요소가 없으면 -1을 리턴하는 특징을 사용!
        while (index >= 0) {
            index = str.indexOf(key,index+1);
            cnt++;
        }
        System.out.println("cnt = " + cnt);
    }
}
