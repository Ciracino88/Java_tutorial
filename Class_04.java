public class Class_04 {
    public static void main(String[] args) {
        // 형 변환
        int score = 99;
        System.out.println(score);

        // float 타입으로 변환되어 출력됨
        System.out.println((float)score);

        // double 로 변환
        System.out.println((double) score);

        // 정수 + 실수
        score = 99 + (int) (98.8); // 99 + 98 : 소숫점이 버려짐
        System.out.println(score);

        // 숫자를 문자열로
        String s1 = String.valueOf(99);
        System.out.println(s1);

        // Integer.toString
        s1 = Integer.toString(99);
        System.out.println(s1);

        // double 을 문자열로
        String s2 = String.valueOf(99.9);
        System.out.println(s2);

        // Double.toString
        s2 = Double.toString(99.9);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("100");
        System.out.println(i);

        // 문자열을 double 로
        double d = Double.parseDouble("100.0");
        System.out.println(d);
    }
}
