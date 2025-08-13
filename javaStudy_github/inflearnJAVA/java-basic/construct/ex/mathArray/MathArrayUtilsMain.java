package construct.ex;

import static construct.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        // 문제 요청 사항
        // 객체를 생성하지 않고 사용해야 합니다. 누군가 실수 MathArrayUtils의 인스턴스를 생성하지 못하도록 막으세요
        // 의미 MathArrayUtils mathArrayUtils = new MathArrayUtils(); 로 인스턴스를 생성하지 못하도록 처리해라
        int[] values = {1,2,3,4,5};

        // 꿀팁 !!!!! main에서 빨간 밑줄 -> 생성되지 않았다는 뜻!! 빨간 밑줄에서 커서 가져다 두고 alt + enter 누르면 자동으로 생성!!
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));
    }
}
