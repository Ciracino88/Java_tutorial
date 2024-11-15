package Class_19;
import java.util.Scanner;

abstract class Converter{

    abstract protected double convert(double src);

    abstract protected String getSrcString();

    abstract protected String getDestString();

    protected double ratio;//비율

    public void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다");

        System.out.println(getSrcString()+"을 입력하세요>> ");

        double val = sc.nextDouble();

        double res = convert(val);

        System.out.println("변환결과: "+res+getDestString()+"입니다");

        sc.close();

    }
}

class won2Dollar extends Converter{
    won2Dollar() {}
    won2Dollar(double won) {
        convert(won);
    }
    protected double convert(double src) {
        ratio = 1350;
        return src/ratio;
    }

    protected String getSrcString() {
        return "원";
    }
    protected String getDestString() {
        return "달러";
    }
}

public class new1 {
    public static void main(String[] args) {
        won2Dollar obj = new won2Dollar();
        obj.run();
    }
}
