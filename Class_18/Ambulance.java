package Class_18;

public class Ambulance extends EmergencyCar {
    // 여기서는 int 타입의 인스턴스를 씀.
    int cnt;
    Ambulance() {}
    Ambulance(double cc, String c, int cnt) {
        super(c, cc);
        this.cnt = cnt;
    }

    public String toString() {
        return "엔진 " + super.getCC() + "\n회사명 " + getCom() + "\n개수 " + cnt;
    }
}
