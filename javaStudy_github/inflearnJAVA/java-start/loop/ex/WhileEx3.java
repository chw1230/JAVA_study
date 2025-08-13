package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int max = 10;
        int sum = 0;
        System.out.println("while ver");
        while (max>0){
            sum = sum + max;
            max--;
        }
        System.out.println("sum = " + sum);
        System.out.println();


        System.out.println("for ver");
        for (max = 10,sum = 0;max>0;max--){
            sum = sum + max;
        }
        System.out.println("sum = " + sum);
    }
}
