package Class_12;

class Homework {
    // 도형의 이름과 길이를 전달하면 넓이를 구하는 메서드
    // getArea() 오버라이딩 하기
    // 도형은 다음과 같이 구성
    // 실수 타입 반지름을 갖는 원
    // 정수 타입 가로세로를 갖는 사각형
    // 실수 타입 밑변높이를 갖는 삼각형

    // 이름을 받는 이유 : 메소드 오버라이딩 방지용?
    // ~~.getArea("사각형", 3, 4)
    // ~~.getArea("삼각형", 4.5, 2.3)
    // ~~.getArea("원", 5.6)

    public static void main(String[] args) {
        Shape s = new Shape();
        s.getArea("원", 1);
        s.getArea("사각형", 1, 2);

        // 리팩토링 1
        // 입력은 정수로 인식되지만 사용자가 삼각형 계산을 원하는 경우
        s.getArea("삼각형", 1, 2);

        // 진짜 삼각형 계산
        s.getArea("삼각형", 1.2f, 2.4f);

        // 리팩토링이 필요한 부분
        // 이름을 잘못 입력해도 계산이 되버림
        s.getArea("사각형", 5);

    }
}
