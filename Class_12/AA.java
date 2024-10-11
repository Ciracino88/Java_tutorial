package Class_12;

class AA {
    int a,b,c,d;
    AA() {
        a=1;
        b=1;
        c=1;
        d=1;
    }

    AA(int d) {
        // 생성자는 반드시 맨 첫줄에만 등장해야 함.
        this();
        this.d=d;
    }

    void show() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    // 매소드 오버라이딩
    // 함부로 조지면 안됨. 파라미터 타입을 잘 설정해줘야 함
    // 파라미터의 입력만 달라지고 수행하는 동작은 비슷핟도록 설계해야함.
    void show(int n) {
        System.out.println("method overriding!");
    }
}