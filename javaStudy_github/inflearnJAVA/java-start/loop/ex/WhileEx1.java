package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        System.out.println("while ver");
        int cnt = 1;
        while( cnt <= 10){
            System.out.println("cnt = " + cnt);
            cnt++;
        }
        System.out.println();


        System.out.println("for ver");
        for (cnt=1;cnt<=10;cnt++){
            System.out.println("cnt = " + cnt);
        }
    }
}
