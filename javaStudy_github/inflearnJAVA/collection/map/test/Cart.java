package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    //문제7 - 장바구니
    private Map<Product, Integer> cartMap = new HashMap<>();

    // 장바구니 추가
    public void add(Product product, int ea) {
        if (cartMap.containsKey(product)) {
            Integer cnt = cartMap.get(product);
            cnt += ea;
            cartMap.put(product, cnt);
        }else {
            cartMap.put(product, ea);
        }
    }

    // 장바구니 제거
    public void minus(Product product, int ea) {
        Integer cnt = cartMap.get(product);
        cnt -= ea;
        cartMap.put(product, cnt);
        if (cnt <= 0) {
            cartMap.remove(product);
        }
    }

    // 모든 상품 출력
    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: "+entry.getKey()+", 수량: "+entry.getValue());
        }
    }
}
