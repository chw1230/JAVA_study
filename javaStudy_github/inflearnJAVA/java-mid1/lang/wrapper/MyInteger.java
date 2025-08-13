package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return "" + value; //  방법 1 문자를 숫자로 변환
        // 방법 2 String.valueOf(value);
    }
}
