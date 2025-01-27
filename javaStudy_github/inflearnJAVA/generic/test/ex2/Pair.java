package generic.test.ex2;

// 문제2 - Pair 클래스 만들기
public class Pair<T1, T2> {
    private T1 first;
    private T2 second;


    public void setFirst(T1 value1) {
        this.first= value1;
    }

    public T1 getFirst() {
        return first;
    }

    public void setSecond(T2 value2) {
        this.second= value2;
    }

    public T2 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
