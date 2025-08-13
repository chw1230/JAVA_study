package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }
/*  IDE 생성 toString( )
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';


    } */

    // 우리가 원하는 출력 양식 [A->B->C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();  // why StringBuilder 사용? -> 루프에서 문자열을 더하는데 유리하기 때문에
        Node x = this; // 일단 자기 자신을 넣음
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            x = x.next; // 탐색의 위치를 다음으로 이동
            if(x != null) {
                sb.append("->");
            }

        }
        sb.append("]");
        return sb.toString();
    }
}
