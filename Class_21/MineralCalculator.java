package Class_21;

public class MineralCalculator {
    int value = 0;

    public void add(Mineral m) {
        if (m instanceof Mineral) {
            this.value += m.getValue();
        } else {
            System.out.println("other logic");
        }
    }
}
