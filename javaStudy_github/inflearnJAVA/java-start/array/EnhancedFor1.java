package array;

import java.util.Arrays;

        public class EnhancedFor1 {
            public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for(int i =0;i < numbers.length ;i++){
            int number = numbers[i];
            System.out.println(number);
        }
        System.out.println();
        // 향상된 for 문 !!!!!!!! 많이 사용!!!!!!!!!
        for (int number : numbers){
             System.out.println(number);
        }
    }
}
