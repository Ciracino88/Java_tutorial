package Class_11;
// 핸들러 클래스

public class Handler_student {
    Student target;

    public Handler_student(Student target) {
        this.target = target;
    }

    // 우리 반은 A,B,C 등급밖에 없단다... 나머진 낙제야..
    public String return_grade() {
        int score = target.score;
        if (90 <= score && score <= 100) {
            return "A";
        }

        if (70 <= score && score < 90) {
            return "B";
        }

        if (40 <= score && score < 70) {
            return "C";
        }

        else {
            return "F";
        }
    }

    // 학생 정보를 출력
    public void print_info() {
        System.out.println(target.get_id() + " " + target.get_name() + " 님의 점수는 " + Integer.toString(target.get_score()) + "점이므로 부여된 등급은 " + return_grade() + "입니다.");
    }
}
