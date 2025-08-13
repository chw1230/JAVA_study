package lang.wrapper.test;

public class MYLottoGeneratorMain1 {
    public static void main(String[] args) {
        MYLottoGenerator1 lottoGenerator = new MYLottoGenerator1();
        int[] lottoNumbers = lottoGenerator.generate();

        System.out.print("로또 번호: ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
