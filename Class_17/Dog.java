package Class_17;

public class Dog {
    // 먹이 종류
    protected String food_type;

    Dog(String food_type){
        this.food_type = food_type;
    }

    void print_my_food_type(){
        System.out.println("나는 " + food_type + "를 먹어요!");
    }
}
