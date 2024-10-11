package Class_12;

class Student {
    Phone p;
    int id;
    String name;
    Student(String p, int id, String name) {
        this.p = new Phone(p);
        this.id = id;
        this.name = name;
    }

    void intro() {
        System.out.println(name);
        System.out.println(Integer.toString(id));
        System.out.println(p.phone_number);
    }
}
