package Class_15;

public class Main {
    public static void main(String[] args) {
        double won = 1000000;
        CConverter.setRate(1229.40);
        System.out.println("백만원은 " + CConverter.toDoller(won) + "달러");

        int []a = {1,2,3,4,5};
        arrayUtil.print(a);

        double []b = {1.1,2.2,3.3,4.4,5.5};
        arrayUtil.print(b);
    }

}
