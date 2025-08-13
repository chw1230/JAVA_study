package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        System.out.println("avg = " + avg(a,b,c));

        int x = 15, y = 25, z = 35;
        System.out.println("avg = " + avg(x,y,z));
    }

    public static double avg(int a, int b, int c) {
        return a + b + c / 3.0;
    }
}
