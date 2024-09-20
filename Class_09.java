// 데이터 클래스 예제
class AA {
    // 속성은 필드다.
    // 필드는 인스턴스 필드와 스테틱 필드로 나뉜다.
    int a = 1234; // 인스턴스 필드
}

// 핸들러 클래스
class People {
    String name;
    int age;
}

public class Class_09 {
    public static void main(String[] args) {
        // 클래스 : 객체의 특징을 속성과 행위로 표현한 것.
        // 속성은 인스턴스, 행위는 메서드

        // 클래스는 크게 데이터 클래스와 핸들러 클래스로 나눌 수 있다
        // 데이터 클래스는 연산 및 로직을 처리
        // 핸들러 클래스는

        AA x = new AA(); // 클래스는 객체화하여 사용한다. (클래스의 인스턴스화)
        System.out.println(x.a); // 인스턴스를 이용해 클래스 내부의 값을 불러온다.

        x.a = 5678; // 내부의 값을 변경할 수도 있다.
        System.out.println(x.a);

        People p = new People();
        p.name = "John";
        p.age = 30;
        System.out.println(p.name);
        System.out.println(p.age);
    }
}