package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        // 마지막 노드 조회하기
        System.out.println("마지막 노드 조회하기");
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // 특정 인덱스의 노드 조회하기
        System.out.println("특정 인덱스의 노드 조회하기");
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x != null) {  // 나의 다음이 null 인 경우 반복문 실행 안함!
            if(x.next == null){
                return x;
            }
            x = x.next;
        }
        return null;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
             x = x.next;
        }
        return x;
    }

    private static void add(Node node, String string) {
        // 마지막 노드에 연결을 하는 것! 그러면 마지막 노드를 찾으면 되겠다!
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(string); // 마지막 노드의 다음에 새 노드를 연결 시켜줌!
    }
}
