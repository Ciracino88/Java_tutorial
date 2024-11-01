package Class_14;

public class user {
    String name;
    float sum; // 현금
    int add; // 매월 넣는 추가 시드
    stock[] stocks = new stock[10];

    user(String name, float sum, int add) {
        this.name = name;
        this.sum = sum;
        this.add = add;
    }

    void regist_stock(stock s) {
        int i = 0;

        while (i < stocks.length) {
            if (stocks[i] == null) {
                stocks[i] = s;
            }

            
        }

    }

    void print_stocks() {
        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] != null) {
                System.out.println(stocks[i].name + " " + stocks[i].n);
            }
        }
    }
}
