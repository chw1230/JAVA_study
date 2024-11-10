package construct.ex;

public class MathArrayUtils {
    // 문제 요청 사항
    // 객체를 생성하지 않고 사용해야 합니다. 누군가 실수 MathArrayUtils의 인스턴스를 생성하지 못하도록 막으세요
    // 의미 MathArrayUtils mathArrayUtils = new MathArrayUtils(); 로 인스턴스를 생성하지 못하도록 처리해라
    // 그렇다면 인스턴스를 생성하지 않도록 하려면 생성자를 private로 막으면 되겠구나!!
    private MathArrayUtils(){

    }

    public static int sum(int[] array){
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total;
    }

    public static double average(int[] array){
        return (double)sum(array) / array.length;
    }

    public static int min(int[] array){
        int minValue = array[0];
        for (int i : array) {
            if(minValue >= i){
                minValue = i;
            }
        }
        return minValue;
    }

    public static int max(int[] array){
        int maxValue = array[0];
        for (int i : array) {
            if(maxValue <= i){
                maxValue = i;
            }
        }
        return maxValue;
    }
}
