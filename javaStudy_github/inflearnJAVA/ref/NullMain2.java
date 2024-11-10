package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null; // 주소 전달이 되는게 아니라 null값 만이 전달되어 주소가 없아서 오루 발생
        data.value = 10; // NullPointerException
        System.out.println("data.value = " + data.value);
    }
}
