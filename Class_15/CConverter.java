package Class_15;

class CConverter {
    // static 메서드는 static 요소들만 사용할 수 있다.
    static double rate = 0;

    static void setRate(double rate) {
        // this 를 붙일 수 없음. this 는 인스턴스 필드에만 붙일 수 있음.
        // static 필드는 클래스 이름으로 접근함.
        CConverter.rate = rate;
    }

    static double toDoller(double won) {
        return won / rate;
    }
}
