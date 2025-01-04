package nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        // 지역 변수
        int localVar = 1;

        class LocalPrinter implements Printer{ // 인터페이스 구현 사용이 가능하다는 것을 보여주기 위해서
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = "+ value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar); // 매개변수에도 접근 가능  매개변수도 지역변수의 한 종류 이기때문에
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2 );
    }
}
