package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 10;

    /* final에 초기값이 있는 경우에는 생성자를 통한 값 변화 안됨, 초기값이 없는 final변수에만 한해서 생성자를 통한 값 변화가 가능하다!!
    public FieldInit(int value) {
        this.value =value;
    }
     */
}