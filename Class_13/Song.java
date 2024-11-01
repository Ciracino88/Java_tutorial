package Class_13;

import java.util.Scanner;

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
