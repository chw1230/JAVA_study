package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = "+ sb);

        sb.insert(4, "Java");
        System.out.println("sb.insert = " + sb);

        sb.delete(4, 8);
        System.out.println("sb.delete = " + sb);

        sb.reverse();
        System.out.println("sb.reverse = " + sb);

        //StringBuilder -> String으로 바꾸기
        String string = sb.toString();
        System.out.println("string = " + string);

        // String은 불변 매번 생성되고 참조 대사 없으면 버려짐
        // StringBuilder는 가변 -> 메모리 사용줄이고 성능햘상 -> 사이드 이펙트 주의
        // 보통은 빌더로 문자열 바꿀일 있을떄 바꾸고 마지막에 사이드 이펙트 막기위해 다시 스트링으로 바꿈!!
    }
}
