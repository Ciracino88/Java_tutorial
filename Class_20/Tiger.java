package Class_20;

public class Tiger extends Animal implements MeatAnimal {

    Tiger(String name){
        super(name);
    }

    public String getMeat() {
        return "Meet";
    }
}
