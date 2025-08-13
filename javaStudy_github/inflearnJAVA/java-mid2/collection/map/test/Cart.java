package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    //문제7 - 장바구니
    private Map<Product, Integer> cartMap = new HashMap<>();

    // 장바구니 추가
    public void add(Product product, int ea) {
        // 코드 리펙토링!!!!!
        cartMap.put(product, cartMap.getOrDefault(product, 0) + ea);
    }

    // 장바구니 제거
    public void minus(Product product, int ea) {
        // 코드 리펙토링!!!!!
        Integer cnt = cartMap.getOrDefault(product, 0);
        if (cnt - ea <= 0) {
            cartMap.remove(product);
        }else{
            cartMap.put(product, cnt - ea);
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
