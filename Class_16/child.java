package Class_16;

// extends 메서드를 이용해 부모 클래스를 상속
public class child extends parent {
    String child_name;

    void print_child() {
        System.out.println(child_name);
    }

    void print_parent() {
        System.out.println(parent_name);
    }
}
