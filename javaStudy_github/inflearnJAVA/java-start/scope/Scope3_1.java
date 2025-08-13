package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 20;
        int temp = 0;
        if (m>0){
            temp = m * 2;
            System.out.println("temp = " + temp);
            // temp는 if 문 안에서만 사용되는데
            // main에서 선언하면 비효율적인 메모리를 사용하게 된다.
        }
        System.out.println("m = " + m);
    }
}
