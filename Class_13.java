import java.util.*;

public class Class_13 {
    public static void main(String[] args) {
        TV tv1 = new TV("LG", 2024, 58);
        tv1.show_info();

        Song song1 = new Song();
        song1.show_info();
    }
}

class TV {
    private String brand;
    private int published_date;
    private int width;

    TV(String brand, int published_date, int width) {
        this.brand = brand;
        this.published_date = published_date;
        this.width = width;
    }

    void show_info() {
        String formatted_string = String.format("회사명 : %s\n제작년도 : %d년\n크기 : %d인치", brand, published_date, width);
        System.out.println(formatted_string);
    }
}

class Song {
    private String title;
    private String artist;
    private int published_date;
    private String nationality;
    Scanner sc = new Scanner(System.in);

    Song() {
        get_title();
        get_artist();
        get_published_date();
        get_nationality();
    }

    void show_info() {
        String formatted_string = String.format("노래제목 : %s\n출시 : %d년\n가수 : %s\n국적 : %s", title, published_date, artist, nationality);
        System.out.println(formatted_string);
    }

    void get_title() {
        System.out.println("노래제목 ");
        this.title = sc.next();
    }

    void get_published_date() {
        System.out.println("출시년도 ");
        this.published_date = sc.nextInt();
    }

    void get_artist() {
        System.out.println("가수 ");
        this.artist = sc.next();
    }

    void get_nationality() {
        System.out.println("국적 ");
        this.nationality = sc.next();
    }
}