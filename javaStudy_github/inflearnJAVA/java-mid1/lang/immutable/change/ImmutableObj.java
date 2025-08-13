package lang.immutable.change;

public class ImmutableObj {
    private final int value;
    public ImmutableObj(int value) {
        this.value = value;
    }
    // 새로운 객체를 만들어서 반환한다.
    public ImmutableObj add(int addValue){
        int result = value + addValue;
        return new ImmutableObj(result);
    }
    public int getValue() {
        return value;
    }
}
