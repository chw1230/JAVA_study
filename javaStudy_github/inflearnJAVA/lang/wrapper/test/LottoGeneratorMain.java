package lang.wrapper.test;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        System.out.print("로또 번호: ");
        int[] lottoNums = generator.generate();
        for (int num : lottoNums) {
            System.out.print(num + " ");
        }
    }
}
