package lang.wrapper.test;

import java.util.Random;

public class MyLottoMain2 {




    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[6];
        boolean run = true;
        int cnt = 0;

        while (run) {
            int randNum = random.nextInt(45) + 1;
            for (int i = 0; i < cnt; i++) {
                if ( arr[i] == randNum){
                    randNum = random.nextInt(45) + 1;
                }
            }
            arr[cnt] = randNum;
            cnt++;
            if (cnt == 6){
                run = false;
            }
        }
        
        System.out.print("로또 번호: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
