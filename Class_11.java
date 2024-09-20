// 학생의 성적 정보를 저장하는 Student 클래스
// 기능 : 정보 출력, 등급 계산 (기준은 내맘대로)
// 학생 : 이름, 학번, 성적
// get, set 메서드 포함

public class Class_11 {
    public static void main(String[] args) {
        Student s = new Student("lee_seung_ho", "202120819", 40);
        Handler_student h = new Handler_student(s);
        h.print_info();
        h.target.set_id("12345678");
        h.print_info();
    }
}
