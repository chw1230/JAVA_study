package collection.array;

public class MyArrayListV4Main {

    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
//      stringList.add(1); 숫자 들어갈 수 없음 제네릭 String 사용했기 때문에
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
//      stringList.add("a"); 문자 들어갈 수 없음 제네릭 Integer 사용했기 때문에
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
    }
}
