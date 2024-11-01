package Class_17;

public class Main {

    // 객체 간의 형변환이 가능하다. 단, 상속관계일 때만 가능하다.
    public static void main(String[] args) {
        HouseDog dog1 = new HouseDog("멍멍이", true, "개사료");
        Dog dog2 = new Dog("열매");

        dog1.print_info();
        dog2.print_my_food_type();
    }
}
