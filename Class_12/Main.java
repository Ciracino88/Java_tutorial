package Class_12;

public class Main {
    public static void main(String[] args) {
        // AA a = new AA();
        // a.show();
        // a.show(10);

        // WhatType w = new WhatType();
        // w.is_type(1);
        // w.is_type(1.1);
        // w.is_type(false);

        // w.maxValue(1, 2);
        // w.maxValue("123", "1234");

        // w.lengthValue(1234);
        // w.lengthValue("12345");

        // Student s1 = new Student("010-0000-0000", 2021000, "아무개");
        // Student s2 = new Student("010-1111-0000", 2021000, "아무개");
        // Student s3 = new Student("010-2222-0000", 2021000, "아무개");

        // s1.intro();
        // s2.intro();
        // s3.intro();

        // private : 같은 클래스 내부에서만 접근 가능
        // default : 아무것도 부여하지 않을 때. 같은 클래스 및 같은 패키지 내에서만 접근 가능.
        // static : static 을 저장하는 공간이 따로 있음. 여기에 모든 static 값들이 저장됨. 프로그램 시작과 동시에 올라옴. 기본적으로 초깃값을 부여해놓는게 좋음.
        Test t = new Test(0);
        System.out.println(t.x);
        System.out.println(t.y);
        System.out.println(Test.y); // 스태틱은 이런식으로 클래스명으로도 접근이 가능함. 반드시 인스턴스로 접근하지 않아도 됨.
        Test.show(); // 메소드에도 스태틱을 붙여서 이런식으로 함수를 바로 호출할 수 있음. 이걸 이용한 디자인패턴이 싱글톤.
        Test.file_read();
    }
}
