package collection.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        // 마지막에 추가 // O(n) -> 루프 타고 마지막에 추가하는 것이기 때문에
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 첫 번째 항목에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0, "d"); // O(1) -> 첫 번째 항목에 추가하는 거라서
        System.out.println(list);

        System.out.println("첫 번째 항목에 삭제");
        list.remove(0); // remove first O(1) -> 첫 번째 항목에 삭제하는 거라서
        System.out.println(list);

        // 중간 항목에 추가 삭제
        System.out.println("중간 항목에 추가");
        list.add(1, "e"); // O(n) -> 중간 항목을 찾는데 O(n) 소요되어서!
        System.out.println(list);

        System.out.println("중간 항목에 삭제");
        list.remove(1); // O(n) -> 중간 항목을 찾는데 O(n) 소요되어서!
        System.out.println(list);
    }
}
