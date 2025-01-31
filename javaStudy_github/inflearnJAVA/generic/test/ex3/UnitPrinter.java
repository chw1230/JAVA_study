package generic.test.ex3;

public class UnitPrinter {

    // 제네릭 메서드 활용
    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", " + "HP: " + unit.getHp());
    }

    // 와일드카드 활용
    public static void printV2(Shuttle<? extends BioUnit> t1) {
        BioUnit unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", " + "HP: " + unit.getHp());
    }
}
