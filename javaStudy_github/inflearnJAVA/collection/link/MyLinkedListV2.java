package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    // 추가 코드!
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) {  // 처음 위치에 데이터 추가
            newNode.next = first;
            first = newNode;
        } else {  // 중간 위치에 데이터 추가
            Node perv = getNode(index - 1); // 직전 노드 구하기!
            newNode.next = perv.next;
            perv.next = newNode;
        }
        size++;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    // 추가 코드
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if (index == 0) {  // 처음 위치에 데이터 추가
            first = removeNode.next;
        } else { // 중간 위치에 데이터 추가
            Node perv = getNode(index - 1);
            perv.next = removeNode.next;
        }
        removeNode.next = null;
        removeNode.item = null;
        size--;
        return removedItem;
    }

    public Object get(int index){
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
             x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first ; x != null ; x = x.next) {
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
}
