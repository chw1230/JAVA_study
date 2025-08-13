package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> list = new ArrayList<>();
    int sum = 0;

    public void addItem(Item item1) {
        list.add(item1);
    }

    public void displayItems() {
        System.out.println("장바구니 상풍 출력");
        /*
        for (int i = 0; i < list.size(); i++) {
            System.out.println("상품명: "+ list.get(i).getName() +", 합계: " + list.get(i).getTotalPrice());
            sum += list.get(i).getTotalPrice();
        }
         */
        for (Item item : list) {
            System.out.println("상품명: "+ item.getName() +", 합계: " + item.getTotalPrice());
            sum += item.getTotalPrice();
        }
        System.out.println("전체 가격 합: " + sum);
    }
}
