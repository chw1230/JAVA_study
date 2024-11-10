package static2;

public class DecomMain1 {
    public static void main(String[] args) {
        DecoUtil1 util1 = new DecoUtil1();
        String s = "Hello";
        String deco = util1.deco(s);

        System.out.println("befor : "+s);
        System.out.println("after : "+deco);
    }
}
