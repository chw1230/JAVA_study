package lang.string.chaining;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this; // 자기 자신의 주소(참조값)을 전달함!!!!!
    }

    public int getValue(){
        return value;
    }
}
