package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        // 마지막에 추가 // 0(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addLast"); // O(1)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst"); // 0(n)
        System.out.println(list);

        // 삭제
        Object removed = list.remove(4); // O(1)
        System.out.println("removed(4) = " + removed); // 제거된 값이 나오게 코드 작성함!
        System.out.println(list);

        Object removed1 = list.remove(0); // O(n)
        System.out.println("removed1 = " + removed1);
        System.out.println(list);


        /*
        list.add("d");
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);

         */
    }
}
