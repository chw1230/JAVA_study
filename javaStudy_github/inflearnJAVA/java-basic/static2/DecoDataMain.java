package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출: ");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출: ");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출: ");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1);

        /*
        출력
        1. 정적 호출:
        staticValue = 1
        2. 인스턴스 호출:
        instanceValue = 1
        staticValue = 2
        3. 인스턴스 호출:
        instanceValue = 1
        staticValue = 3
        instanceValue = 2
         */
    }
}
