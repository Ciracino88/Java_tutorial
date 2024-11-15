package Class_19;

public class Dog extends animal {
    @Override // abstract 으로 선언한 녀석들은 자식단에서 반드시 구현되어야 한다.
    void abstract_cry() {
        System.out.println("abstract 으로 구현된 함수입니다. 자식 단에서 구현되었습니다."); // 내부 로직 작성
    }
}
