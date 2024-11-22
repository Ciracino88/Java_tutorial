package Class_20;

import Class_19.Cat;

public class Main {
    public static void main(String[] args) {
        Animal [] x = new Animal[10];

        x[0] = new Tiger("Tiger");
        x[1] = new Lion("Lion");

        ZooKeeper z1 = new ZooKeeper();

        for (int i = 0; i < 2; i++) {
            z1.feed(x[i]);
        }
    }
}
