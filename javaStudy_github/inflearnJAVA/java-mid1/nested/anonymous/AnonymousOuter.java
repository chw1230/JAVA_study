package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;
/*
    ------원래 코드------
    public void process(int paramVar) { ------여기서 선언하고!!!!------
        // 지역 변수
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = "+ value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter(); ------여기서 생성하고!!!!------
        printer.print();
        선언과 생성의 과정을 하나로 합친 것!
    }
 */
    public void process(int paramVar) {
        // 지역 변수
        int localVar = 1;

        // Printer는 인터페이스!!
        Printer printer = new Printer() { // Printer라는 인터페이스를 구현하면서 인터페이스의 구현체를 이름없이 만들어서 생성!!!
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar); // 매개변수에도 접근 가능  매개변수도 지역변수의 한 종류 이기때문에
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print(); // 바로 호출해서 사용가능하다!!
        System.out.println("printer.class=" + printer.getClass());
    }


    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2 );
    }
}
