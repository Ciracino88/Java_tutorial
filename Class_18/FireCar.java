package Class_18;

public class FireCar extends EmergencyCar {
    // 여기서는 String 타입의 인스턴스를 씀.
    // 하위 클래스에서 달라지는 부분만 이곳에서 정의
    // 전략 패턴이랑 매우 유사!! (인터페이스가 없긴 하다만.. ㅎㅎ)
    String kind;
    FireCar() {}
    FireCar(double cc, String c, String k) {
        // 상위 클래스에서 정의했던 생성자 형식에 맞게 넣어주자.
        super(c, cc);
        kind = k;
    }

    // 이런 식으로 super 를 이용해 상위 클래스의 메서드를 부를 수 있다.
    public String toString() {
        return "엔진 " + super.getCC() + "\n회사명 " + getCom() + "\n종류 " + kind.toString();
    }
}
