package Class_19;

interface interface_method {
    public abstract void method1();
}

public class Cat extends animal implements interface_method {
    @Override
    void abstract_cry() {
        System.out.println("나는 고양이다.");
    }

    // interface 단에서 정의해둔 놈을 구현한다.
    @Override
    public void method1() {
        System.out.println("인터페이스 단에서 미리 선언해둔 함수입니다.");
    }
}
