package generic.test.ex1;

// 문제 1 - Container 클래스 만들기
public class Container<T> {

    private T value;

    public void setItem(T value) {
        this.value = value;
    }

    public T getItem() {
        return value;
    }

    public Boolean isEmpty() {
        return value == null;
    }
}
