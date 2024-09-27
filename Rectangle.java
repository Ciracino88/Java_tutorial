public class Rectangle {
    private Point left_bottom;
    private Point right_top;

    // 반환값이 없다면 원점과 (1, 1) 을 갖도록 함.
    Rectangle() {
        this.left_bottom = new Point(0, 0);
        this.right_top = new Point(1, 1);
    }

    // 4개의 좌표를 입력하는 경우
    Rectangle(int x1, int y1, int x2, int y2) {
        // 입력된 값중 작은 값이 좌측하단 점의 좌표임.
        int left_x = x1 < x2 ? x1 : x2;
        int left_y = y1 < y2 ? y1 : y2;

        // 큰 값은 오른쪽에게 주기
        int right_x = x1 > x2 ? x1 : x2;
        int right_y = y1 > y2 ? y1 : y2;

        this.left_bottom = new Point(left_x, left_y);
        this.right_top = new Point(right_x, right_y);
    }

    // 좌측 하단을 Point 형태로 받는 경우
    Rectangle(Point left_point, int right_x, int right_y) {
        this.left_bottom = left_point;
        this.right_top = new Point(right_x, right_y);
    }

    // 우측 상단을 Point 형태로 받는 경우
    Rectangle(int left_x, int left_y, Point right_point) {
        this.left_bottom = new Point(left_x, left_y);
        this.right_top = right_point;
    }

    // 둘 다 Point 형태로 받는 경우
    Rectangle(Point left_point, Point right_point) {
        this.left_bottom = left_point;
        this.right_top = right_point;
    }

    void print_self_info() {
        System.out.println(String.format("(%d, %d), (%d, %d)", left_bottom.x, left_bottom.y, right_top.x, right_top.y));
    }
}
