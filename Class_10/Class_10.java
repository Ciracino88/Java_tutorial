package Class_10;

public class Class_10 {
    public static void main(String[] args) {
        Snack snack = new Snack();
        snack.price = 2000;
        snack.name = "Poka_chip";
        snack.quantity = 150;

        System.out.println(snack.price);
        System.out.println(snack.name);
        System.out.println(snack.quantity);

        Circle circle = new Circle();
        circle.setX(100);
        circle.setY(100);
        circle.setR(10);
        circle.info();
    }
}
