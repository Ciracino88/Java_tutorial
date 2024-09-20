class Snack {
    int price;
    String name;
    int quantity;
}

class Circle {
    int x, y;
    double r;

    // 클래스 내부에서 자기 자신의 값에 접근할 때 this 를 사용.
    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void setR(double r) {
        this.r = r;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    double getR() {
        return this.r;
    }

    void info() {
        System.out.println("중심 좌표: ("+x+", "+y+")");
        System.out.println("반지름: "+r+"");
    }
}

public class Class_10 {
    public static void main(String[] args) {
        Snack snack = new Snack();
        snack.price = 2000;
        snack.name = "Poka_chip";
        snack.quantity = 150;

        System.out.println(snack.price);
        System.out.println(snack.name);
        System.out.println(snack.quantity);

        Circle circle = new Circle();
        circle.setX(100);
        circle.setY(100);
        circle.setR(10);
        circle.info();
    }
}
