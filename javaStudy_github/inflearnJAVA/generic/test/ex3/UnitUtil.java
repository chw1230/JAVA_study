package generic.test.ex3;

// 문제 1 -> 제네릭 메서드 만들기
public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T z1, T z2) {
        return z1.getHp() >= z2.getHp() ? z1 : z2;
    }
}
