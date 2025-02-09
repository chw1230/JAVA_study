package collection.list.test.ex2;

public class ShoppingCartMain {

    //코드가 작동하도록 ShoppingCart 클래스 만들기 ShoppingCart는 내부에 리스트를 사용
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayItems();
    }
}
