package Class_14;

public class Main {
    public static void main(String[] args) {
        user s1 = new user("user1", 10, 10);
        s1.regist_stock(new stock("coka-cola", 70, 0.7, 24));
        s1.regist_stock(new stock("qyld", 18, 0.1, 30));
        s1.regist_stock(new stock("qyld", 28, 0.1, 10));
        s1.print_stocks();
    }
}
