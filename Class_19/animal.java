package Class_19;

// abstract 사용하기 위해선 클래스도 abstract 으로 선언해야 한다.
abstract class animal {
    void cry() {
        System.out.println("부모에게서 가져온 함수입니다.");
    }

    abstract void abstract_cry(); // 자식 단에서 구현할 예정
}