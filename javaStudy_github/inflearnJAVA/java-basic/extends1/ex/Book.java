package extends1.ex;

public class Book  extends Item{
    String author;
    String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name,price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print(){
        super.print(); //이거를 생각하지 못했음 나머지는 다 잘했는데 ㅜㅜㅜ
        // 처음에는 밑에 있는 코드만을 적었었지 근데 안되더라고?
        // 해결책 일단 부모에 접근--> super
        // 접근해서 print()에 접근
        // 정리하면 부모에 접근해서 print() 사용
        //super.print() 이것이 나오게 된 것임!
        System.out.println("- 저자: "+author+", isbn:"+isbn);
    }
}
