package Books;

public class Novel extends Book {
    // 자식단에서 추가되는 필드
    String author;

    @Override
    void print_book_info() {
        System.out.println("제목 " + super.title);
        System.out.println("출판사 " + super.company);
        System.out.println("가격 " + super.price);
        System.out.println("저자 " + this.author);
    }

    Novel(String title, String company, int price, String author) {
        super(title, company, price); // 부모 생성자에게 파라미터 넘기고
        this.author = author; // 자식단 인스턴스만 주입
    }
}
