package static2.ex;

public class Car {
    private static int count;
    private static String name;

    public Car (String name){
        System.out.println("차량 구입, 이름: "+name);
        count++;
        this.name = name;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: "+count);
    }
}
