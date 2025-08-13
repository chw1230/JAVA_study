package collection.map.test;

import java.util.Objects;

public class Product {
    //문제7 - 장바구니
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // 기본 객체를 사용하는 것이 아니라 Product 라는 객체를 사용하기에 직접 오버라이딩 해서 재정의 해줘야함!!!
    // 중복 체크를 위해서!!!!!!! 필요함!!!!!!!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
