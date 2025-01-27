package generic.ex1;

public class ObjectBox {

    // 다형성을 활용한 중복 해결

    private Object value;

    public void set(Object obj) {
        this.value = obj;
    }

    public Object get() {
        return value;
    }
}
