package Class_18;

class EmergencyCar {
    // 하위 클래스에서 공통으로 사용되는 인스턴스 정의
    double cc;
    String company;
    EmergencyCar(){}

    // 하위 클래스에 상속 시킬 때 값을 받은대로 적용
    EmergencyCar(String c, double cc) {
        this.company = c;
        this.cc = cc;
    }

    // 메서드는 디폴트로 퍼블릭으로 주도록 하자.
    public double getCC() {
        return this.cc;
    }

    public String getCom() {
        return this.company;
    }
}
