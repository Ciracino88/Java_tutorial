package Class_21;

public class Main {
    // 인터페이스 VS 공통 함수
    // 인터페이스는 내부 로직이 각 객체마다 다르게 적용된다.
    // 반면, 공통 함수는 내부 로직도 동일하다.

    public static void main(String[] args) {
        // mineral 인터페이스를 상속받는 객체들
        Gold g1 = new Gold();
        Silver s1 = new Silver();

        // 메서드를 이용해 각 객체의 value 를 증가
        g1.getValue();
        s1.getValue();

        // 각 객체의 value 를 여기서 전부 더해나갈 예정
        MineralCalculator mc = new MineralCalculator();

        // 각 광물을 추가
        mc.add(g1);
        mc.add(s1);

        // 출력
        System.out.println(mc.value);
    }
}
