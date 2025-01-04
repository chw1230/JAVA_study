package lang.wrapper.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int cnt;

    public int[] generate() {
        lottoNumbers = new int[6];
        cnt = 0;

        while (cnt < 6) {
            //1~45 생성
            int num = random.nextInt(45) + 1;
            // 중복아닌 경우에만 배열에 넣기
            if (isUnique(num)){
                lottoNumbers[cnt] = num;
                cnt++;
            }
        }
        return lottoNumbers;
    }

    // 중복 체크 메서드
    private boolean isUnique(int num) {
        for (int i = 0; i < cnt; i++) {
            if (lottoNumbers[i] == num) {
                return false;
            }
        }
        return true;
    }
}
