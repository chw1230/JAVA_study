package generic.ex1;

public class GenericBox<T> {
    // <T>에서 T를 타입 매개변수라고 하며 이 타입 매개변수는 이후에 Integer, String으로 변할 수 있음!

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get(){
        return value;
    }

}
