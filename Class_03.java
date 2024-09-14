public class Class_03 {
    public static void main(String[] args) {
        String name;
        name = "ciracino88";

        // 한방에 값 할당하기
        String name2 = "ciracino1234";

        // 문자열 합치기
        System.out.println(name + " 반가워요!");
        System.out.println(name2 + " 님도 반갑습니다!");

        int age = 242;
        // int 랑 문자열 합쳐보기
        System.out.println(name + "의 나이는 " + age);

        // char 타입은 한글자만 적을 수 있음.
        char grade = 'A';
        System.out.println("내 성적은 " + grade);

        // 대충 엄청 큰 수는 int 에 못 담음
        // int i = 100000000000;
        // long 을 사용하여 담는다.
        long l = 10000000000000000L;

        // 이런 식으로 언더바로 끊어서 표현해도 실제로는 언더바가 없는 것처럼 처리됨.
        l = 1_000_000_000_000_000L;
        System.out.println(l);

    }
}
