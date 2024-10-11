package Class_12;

public class WhatType {
    WhatType() {
        
    }

    void is_type(int a) {
        System.out.println("정수입니다.");
    }

    void is_type(double a) {
        System.out.println("실수입니다.");
    }

    void is_type(boolean a) {
        System.out.println("부울입니다.");
    }

    void maxValue(int a, int b) {
        System.out.println(a > b ? a : b);
    }

    void maxValue (String a, String b) {
        System.out.println(Integer.parseInt(a) > Integer.parseInt(b) ? a : b);
    }

    void lengthValue(int a) {
        System.out.println(a);
    }

    void lengthValue(String b) {
        System.out.println(b);
    }
}
