package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        // 지역 변수
        int localVar = 1;

        class LocalPrinter{ // 접근 제어자를 사용할 수 없다.
            int value = 0;

            public void printData(){
                System.out.println("value = "+ value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar); // 매개변수에도 접근 가능  매개변수도 지역변수의 한 종류 이기때문에
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2 );
    }
}
