package midterm;

import java.util.Arrays;

public class Circle {
    double[] p;
    double r;
    double getR() {
        return r;
    }

    Circle(double x, double y, double r) {
        this.p = new double[2];
        this.p[0] = x;
        this.p[1] = y;
        this.r = r;
    }

    Circle(double[] p, double r) {
        this.p = p;
        this.r = r;
    }

    double[] getPoint() {
        return p;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(1.1, 2.2, 3.3);
        System.out.println(c1.p[0]);
        System.out.println("중심"+ Arrays.toString(c1.getPoint()));
        double[] p = {1.1, 2.2};
        Circle c2 = new Circle(p, 2.3);
        Cylinder one = new Cylinder(1.1, 2.2, 3, 4);
        Cylinder two = new Cylinder(1.1, 2.2, 5, 4);

        if (one.connect(two)) {
            System.out.println("o");
        } else {
            System.out.println("n");
        }
    }
}
