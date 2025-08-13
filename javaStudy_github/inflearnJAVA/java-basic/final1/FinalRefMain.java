package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // data = new Data(); 할 수 없음!!!
        // 다른 객체는 접근할 수 없다 이미 주소값이 전달된거니까 주소값을 변경못한다는 말이야!!

        // 참조 대상의 객체 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
