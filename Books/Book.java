package Books;

abstract public class Book {
    String title; // 제목
    String company; // 출판사
    int price;

    // 세부 목록이 책마다 다르니까 자식 단에서 구현
    abstract void print_book_info();

    Book(String title, String company, int price) {
        // 공통 정보 받는건 여기서
        this.title = title;
        this.company = company;
        this.price = price;
    }
}
