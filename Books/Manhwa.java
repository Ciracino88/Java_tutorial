package Books;

public class Manhwa extends Novel {
    // 자식단에서 추가되는 필드
    int how_many;

    @Override
    void print_book_info() {
        System.out.println("제목 " + super.title);
        System.out.println("출판사 " + super.company);
        System.out.println("가격 " + (double) super.price / 1400); // 외국 만화라 달러로 계산 (형변환을 이용)
        System.out.println("저자 " + super.author);
        System.out.println("몇 권 " + this.how_many);
    }

    Manhwa(String title, String company, int price, String author, int how_many) {
        super(title, company, price, author); // 부모 생성자에게 파라미터 넘기고
        this.how_many = how_many; // 자식단 인스턴스만 주입
    }
}
