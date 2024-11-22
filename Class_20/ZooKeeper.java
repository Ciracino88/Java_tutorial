package Class_20;

public class ZooKeeper {
    // 이 메서드는 모든 동물들한테 사용함.
    // 따라서 동물에 따라 내부 로직만 다르게 가야함.
    void feed(Animal a) {
        if (a instanceof MeatAnimal) {
            System.out.println( a.name + " 에게 먹이를 줍니다: " + ((MeatAnimal)a).getMeat() );
        }
    }
}
