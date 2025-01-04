package nested.test.ex1;

public class Library {
    private int cnt;
    private Book[] books;

    public Library(int i) { // 여기가 가장 헷갈렸음
        // int i; 선언해서
        // 일단 생성자 밖에서 Book[] books = new Book[i]; 이렇게 계속 시도했는데
        // 생각을 해보니 i가 없는 상황(즉 i가 0으로 자동 초기화 되어있는 상태였던 것)
        // 그래서 일단 답지를 보니 생성자에서 배열을 만들더라고...
        // 이거 잡으니 문제 해결 되었음!!
        books = new Book[i];
        cnt = 0;
    }

    public void addBook(String title, String author) {
        if (cnt < books.length){
            // 코드 리펙토링!
//            books[cnt] = new Book(title, author);
//            cnt++;
            books[cnt++] = new Book(title, author);
        }
        else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int j = 0; j < books.length; j++) {
            System.out.print("도서 제목: ");
            System.out.print(books[j].title+", ");
            System.out.print("저자: ");
            System.out.print(books[j].author);
            System.out.println();
        }

    }

    private class Book {
        private String title, author;
        public Book(String title,String author) {
            this.title = title;
            this.author = author;
        }
    }
}
