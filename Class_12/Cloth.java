package Class_12;

class Cloth {
    String item_name;
    String item_price;
    String item_color;

    Cloth() {
        
    }

    void get_data(String data, int code) {
        if (code == 0) {
            this.item_name = data;
        }

        else if (code == 1) {
            this.item_color = data;
        }

        else if (code == 2) {
            this.item_price = data;
        }
    }

    void item_info() {
        System.out.println("제품 : " + item_name);
        System.out.println("색상 : " + item_color);
        System.out.println("가격 : " + item_price);
    }
}
