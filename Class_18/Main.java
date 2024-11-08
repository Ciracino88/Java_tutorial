package Class_18;

public class Main {
    public static void main(String[] args) {
        EmergencyCar[] ec = new EmergencyCar[10];
        ec[0] = new Ambulance(4500, "brand1", 5);
        ec[1] = new Ambulance(4500, "brand2", 7);
        ec[2] = new FireCar(8900, "brand3", "사다리차");
        ec[3] = new FireCar(4500, "brand4", "물자동차");

        for (int i = 0; i < 4; i++) {
            System.out.println(ec[i]);
        }
    }
}
