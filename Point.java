public class Point {
    int x;
    int y;

    Point(int x, int y ) {
        this.x = x;
        this.y = y;
    }

    // 좌표값을 입력하지 않으면 원점을 반환하도록 하기
    Point() {
        this.x = 0;
        this.y = 0;
    }
}
