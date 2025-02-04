package collection.link;

public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    // 추가 코드!
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {  // 처음 위치에 데이터 추가
            newNode.next = first;
            first = newNode;
        } else {  // 중간 위치에 데이터 추가
            Node<E> perv = getNode(index - 1); // 직전 노드 구하기!
            newNode.next = perv.next;
            perv.next = newNode;
        }
        size++;
    }

    public Object set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    // 추가 코드
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {  // 처음 위치에 데이터 추가
            first = removeNode.next;
        } else { // 중간 위치에 데이터 추가
            Node<E> perv = getNode(index - 1);
            perv.next = removeNode.next;
        }
        removeNode.next = null;
        removeNode.item = null;
        size--;
        return removedItem;
    }

    public E get(int index){
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
             x = x.next;
        }
        return x;
    }

    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first ; x != null ; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E> { // 중첩 클래스

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        // 우리가 원하는 출력 양식 [A->B->C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();  // why StringBuilder 사용? -> 루프에서 문자열을 더하는데 유리하기 때문에
            Node<E> x = this; // 일단 자기 자신을 넣음
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                x = x.next; // 탐색의 위치를 다음으로 이동
                if (x != null) {
                    sb.append("->");
                }

            }
            sb.append("]");
            return sb.toString();
        }
    }
}
