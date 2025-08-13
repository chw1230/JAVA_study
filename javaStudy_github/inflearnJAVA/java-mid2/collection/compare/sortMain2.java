package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class sortMain2 {

    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교");
        Arrays.sort(array,new AscComparator()); // new AscComparator() 와 같튼 비교자를 직접 넣을 수 있음!!!!
        System.out.println("AscComparator: " + Arrays.toString(array));

        Arrays.sort(array,new DescComparator()); // new DescComparator() 와 같튼 비교자를 직접 넣을 수 있음!!!!
        System.out.println("DescComparator: " + Arrays.toString(array));
        Arrays.sort(array,new AscComparator().reversed()); // DescComparator() 와 같은 결과!! => 오름차순의 역순 => 내림차순
        System.out.println("AscComparator().reversed(): " + Arrays.toString(array));

    }

    static class AscComparator implements Comparator<Integer> {
        // 오름차순
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1= " + o1 + " o2= "+o2);
            return (o1<o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }

    static class DescComparator implements Comparator<Integer> {
        // 내림차순
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1= " + o1 + " o2= "+o2);
            return  ((o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1)) * -1;
        }
    }
}
