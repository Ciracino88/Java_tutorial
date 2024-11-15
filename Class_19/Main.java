package Class_19;

public class Main {
    public static void main(String[] args) {
        // extends 를 이용하면 이런 식으로 타입을 부모 타입으로 선언해도 된다!
        animal d1 = new Dog();
        animal a1 = new Ant();
        Cat c1 = new Cat();

        d1.cry();
        d1.abstract_cry();
        a1.cry();
        a1.abstract_cry();
        c1.cry();
        c1.abstract_cry();

        // 인터페이스에서 정의한 함수를 사용하기 위해서는 인스턴스의 타입을 자식 단의 타입으로 설정해야 한다.
        // 즉 animal 로 인스턴스를 부르면 method1 이라는 함수는 사용할 수 없다.
        c1.method1();

    }

    void print_info() {
        System.out.println("extends VS implements");
        // 자바에서는 상속이라는 행위가 자주 일어난다.
        // 상속은 필드를 상속하는 경우와 메서드를 상속하는 경우로 나눌 수 있다.
        // 이때, 필드 상속을 강제하는 방법을 extends, 메서드 상속을 강제하는 방법을 implements 라 한다.
        // 이 둘을 분리하는 이유는 상속 과정에서 발생하는 충돌 문제를 줄이기 위함이다.
        // 즉 상속 과정에서 필드 이름과 메서드 이름이 동일할 경우, 인터페이스를 통해 구분이 가능하다.

        // 이를 활용하면 유용한 디자인 패턴을 구현할 수 있다. 대표적으로 전략 패턴이 있다.
        // 전략 패턴 : 행동을 인터페이스로 정의하고 이러한 행동을 하는 대상을 클래스로 정의하는 방법이다.
        // 예를 들어, 결제 시스템을 인터페이스로 정의하고, 결제 수단 (삼성카드, 우리카드) 을 클래스로 정의할 수 있다.
    }
}
