package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruitsArr = fruits.split(",");
        for (String string : fruitsArr) {
            System.out.println(string);
        }
        String joinedString = String.join("->", fruitsArr[0], fruitsArr[1], fruitsArr[2]);
        System.out.println("joinedString = " + joinedString);
    }
}
