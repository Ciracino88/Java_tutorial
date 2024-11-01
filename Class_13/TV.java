package Class_13;

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
