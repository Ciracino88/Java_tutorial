package Books;

public class Main {
    public static void main(String[] args) {
        Book n1 = new Novel("소설", "출판사1", 10000, "작가1");
        Book m1 = new Magazine("매거진", "출판사2", 20000, 8);
        Book mh1 = new Manhwa("만화", "출판사3", 30000, "작가2", 10);

        n1.print_book_info();
        System.out.println("---------------------------");
        m1.print_book_info();
        System.out.println("---------------------------");
        mh1.print_book_info();
    }
}
