package lang.wrapper.test;

import java.util.Random;

public class MYLottoGenerator1 {
    private final Random random = new Random();
    private int[] arr;
    private int cnt;

    public int[] generate() {
        int[] arr = new int[6];
        cnt = 0;

        while (arr[5] == 0) {
            int randNum = random.nextInt(45) + 1;
            for (int i = 0; i < cnt; i++) {
                if (arr[i] == randNum){
                    randNum = random.nextInt(45) + 1;
                    i = 0;
                }
            }
            arr[cnt] = randNum;
            cnt++;
        }
        return arr;
    }
}