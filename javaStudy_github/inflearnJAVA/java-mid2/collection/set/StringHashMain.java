package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println(charA + " = " + (int)charA);
        System.out.println(charB + " = " + (int)charB);
        // 아스키 코드 출력됨

        //hashCode
        System.out.println("hashCode(A) = " + hashCode("A"));
        System.out.println("hashCode(B) = " + hashCode("B"));
        System.out.println("hashCode(AB) = " + hashCode("AB"));

        // hashIndex
        System.out.println("hashIndex(\"A\") = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(\"B\") = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(\"AB\") = " + hashIndex(hashCode("AB")));
    }

    // 문자를 넣으면 문자에 맞는 숫자를 반환하는 메서드
    static int hashCode(String str) {
        char[] charArray = str.toCharArray(); // 문자열을 char배열로 바꾸기!!!!!!
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;

    }

    static int hashIndex(int hashCode){
        return hashCode % CAPACITY;
    }
}
