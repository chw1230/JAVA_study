package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";
        write(3,message);
        write(5,message);
        write(7,message);
    }

    public static void write(int times,String str) {
        for(int i = 0; i < times ; i++){
            System.out.println(str);
        }
        System.out.println();
        return;
    }
}
