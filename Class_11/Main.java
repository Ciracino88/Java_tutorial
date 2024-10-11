package Class_11;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("lee_seung_ho", "202120819", 40);
        Handler_student h = new Handler_student(s);
        h.print_info();
        h.target.set_id("12345678");
        h.print_info();
        
    }
}
