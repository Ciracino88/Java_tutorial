package midterm;

import java.util.Arrays;

public class Cylinder {
    Circle c;
    double height;

    double volume() {
        return c.r * c.r * CirclePI.PI * height;
    }

    boolean connect(Cylinder target) {
        if (Arrays.equals(this.c.p, target.c.p)) {
            return true;
        }

        else {
            return false;
        }
    }

    Cylinder(double x, double y, double radius, double height) {
        this.c = new Circle(x, y, radius);
        this.height = height;
    }
}
