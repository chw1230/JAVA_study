package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        System.out.println("while ver");
        int num = 2;
        int cnt = 1;
        while(cnt <= 10){
            System.out.println(num);
            num = num + 2;
            cnt++;
        }
        System.out.println();

        System.out.println("for ver");
        for(num = 2,cnt = 1;cnt <= 10;num = num + 2, cnt++){
            System.out.println(num);
        }
    }
}
