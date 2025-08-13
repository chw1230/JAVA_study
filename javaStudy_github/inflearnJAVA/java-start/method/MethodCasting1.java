package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        // pinrtNumber ( number); 큰 타입을 작은 타입에 넣을 수 없음
        printNumber((int)number);
    }


    public static void printNumber(int n) {
        System.out.println("숫자 : "+ n );
    }
}
