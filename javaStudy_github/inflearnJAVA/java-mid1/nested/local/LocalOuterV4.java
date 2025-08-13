package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;


    public Printer process(int paramVar) {
        // 지역 변수는 스택 프레임이 종료되는 순간 함께 저장된다.
        int localVar = 1;

        class LocalPrinter implements Printer{ // 인터페이스 구현 사용이 가능하다는 것을 보여주기 위해서
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = "+ value);

                // 인스턴스는 지역 변수 보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar); // 매개변수에도 접근 가능  매개변수도 지역변수의 한 종류 이기때문에
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter(); // LocalPrinter();를 생성한 시점 !!여기!!에서 지역 변수인 localVar와 paramVar를 캡처한다!!!!
        // 만약 localVar의 값을 변경(localVar = 10;) 한다면? 오류가 뜬다!! / 다시 캡처를 해야 해서 그런가????
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
        /*
            필드 확인
            field = int nested.local.LocalOuterV3$1LocalPrinter.value
            field = final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar <-- 얘내들 이 있는 걸 볼 수 있음
            field = final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar <-- 얘내들 이 있는 걸 볼 수 있음
            field = final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0
         */
    }
}
