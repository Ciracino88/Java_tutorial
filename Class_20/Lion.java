package Class_20;

public class Lion extends Animal implements MeatAnimal {
    Lion(String name){
        super(name);
    }

    public String getMeat() {
        return "Chicken";
    }
}
