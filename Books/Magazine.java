package Books;

public class Magazine extends Book {
    // 자식단에서 추가되는 필드
    int when_published;

    @Override
    void print_book_info() {
        System.out.println("제목 " + super.title);
        System.out.println("출판사 " + super.company);
        System.out.println("가격 " + super.price);
        System.out.println("몇월호 " + this.when_published);
    }

    Magazine(String title, String company, int price, int when_published) {
        super(title, company, price); // 부모 생성자에게 파라미터 넘기고
        this.when_published = when_published; // 자식단 인스턴스만 주입
    }
}
