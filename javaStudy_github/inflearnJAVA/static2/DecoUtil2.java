package static2;

public class DecoUtil2 {
    // 메서드 앞에 static을 붙임!! 메서드 변수처럼 클래스로 접근해서 사용
    public static String deco(String str){
        String result = "*" + str + "*";
        return result;
    }
}
