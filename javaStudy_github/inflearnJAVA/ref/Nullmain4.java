package ref;

public class Nullmain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 참조 할 주소를 제공!!하여 오류 해결
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);


        // NullPointerException 발생함 bigData.data가 null이므로 null.value가 되니까 오류 발생
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
