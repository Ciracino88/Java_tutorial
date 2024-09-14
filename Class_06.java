public class Class_06 {
    public static void main(String[] args) {
        String s = "l love Sky and Mountain and you";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함
        System.out.println(s.contains("Sky")); // 문자열은 Sky 를 포함하고 있음
        System.out.println(s.indexOf("Sky")); // 여러 개의 Sky 중 처음으로 등장하는 Sky 의 위치를 반환
        System.out.println(s.lastIndexOf("and")); // 여러 개의 and 중 마지막에 등장하는 and 의 위치를 반환
        System.out.println(s.startsWith("Sky")); // 문자열이 Sky 로 시작하는지를 참 거짓으로 반환
        System.out.println(s.endsWith("Sky")); // 문자열이 Sky 로 끝나는지를 참 거짓으로 반환
    }
}
