import java.sql.SQLOutput;

public class Class_05 {
    public static void main(String[] args) {
        // 논리 연산자
        System.out.println(5 > 3);

        // and : 모든 조건이 만족해야 true
        System.out.println((1> 2) && (2>1));
        System.out.println((3> 2) && (2>1));

        // or : 하나라도 만족하면 true
        System.out.println((1>2) || (3>4));
        System.out.println((1>0) || (3>4));

        // 삼항 연산자
        // 결과 = 조건 ? (참일 경우 결과값) : (거짓일 경우 결과값)
        int x = 5;
        int y = 3;

        int max = (x > y) ? x : y; // 큰 값을 반환
        System.out.println(max);
    }
}
