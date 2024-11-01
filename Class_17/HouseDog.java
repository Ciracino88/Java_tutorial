package Class_17;

public class HouseDog extends Dog {
    String name;
    boolean is_injected;

    HouseDog(String name, boolean is_injected, String food_type) {
        super(food_type);
        this.name = name;
        this.is_injected = is_injected;
    }

    void print_info() {
        System.out.println("Name: " + name);
        System.out.println("is_injected: " + is_injected);
        super.print_my_food_type();
    }
}
