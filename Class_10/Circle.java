package Class_10;

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
        System.out.println("중심 좌표: (" + x + ", " + y + ")");
        System.out.println("반지름: " + r + "");
    }
}
