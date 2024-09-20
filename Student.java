// 데이터 클래스
public class Student {
    String name;
    String id; // 숫자로 된 고유값이지만 첫 자리가 0인 경우를 고려하여 String 으로 설정
    int score;

    public Student(String name, String id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_id(String id) {
        this.id = id;
    }

    public void set_score(int score) {
        this.score = score;
    }

    public String get_name() {
        return name;
    }

    public String get_id() {
        return id;
    }

    public int get_score() {
        return score;
    }
}
