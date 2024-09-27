import java.util.*;

public class Class_14 {
    // 왼쪽 하단점, 오른쪽 상단점. 각 점이 point 인셈.
    // Point 클래스 이용해서 설계 (point 는 x, y 좌표를 가짐)

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(new Point(3, 4), 5, 6);
        Rectangle r3 = new Rectangle(new Point(3, 4), new Point(7, 8));

        r.print_self_info();
        r2.print_self_info();
        r3.print_self_info();
    }
}

