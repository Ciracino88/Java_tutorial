package Class_12;

public class Shape {
    Shape() {

    }

    // 실수 타입 반지름을 갖는 원
    public void getArea(String circle, float r) {
        System.out.println("원이군요");
        System.out.println(r*r*3.14f);
    }
    
    // 정수 타입 가로세로를 갖는 사각형
    void getArea(String square, int a, int b) {
        if (square == "사각형") {
            System.out.println("사각형이군요");
            System.out.println(a*b);
        }

        // 사용자가 삼각형 계산을 원하는 경우
        else if (square == "삼각형") {
            System.out.println("삼각형이군요");
            System.out.println(a*b/2);
        }
    }

    // 실수 타입 밑변높이를 갖는 삼각형
    void getArea(String triangle, float a, float b) {
        System.out.println("삼각형이군요");
        System.out.println(a*b/2);
    }


}
