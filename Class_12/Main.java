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

        Student s1 = new Student("010-0000-0000", 2021000, "아무개");
        Student s2 = new Student("010-1111-0000", 2021000, "아무개");
        Student s3 = new Student("010-2222-0000", 2021000, "아무개");

        s1.intro();
        s2.intro();
        s3.intro();
    }
}
