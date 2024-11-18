package lang.immutable.test;

public class ImmutableMyDataMain {
    public static void main(String[] args) {

        ImmutableMyData data1 = new ImmutableMyData(2024, 1, 1);
        ImmutableMyData data2 = data1;
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);

        System.out.println("2025 -> data1");
        data1 = data1.WithYear(2025);
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
    }
}
