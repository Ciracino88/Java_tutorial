package midterm;

class CatholicMap {
    static String[][] catholic = {{"N", "니콜스관"}, {"D", "다솔관"}};

    public static void main(String[] args) {
        switch (args[0].toUpperCase()) {
            case "N":
                System.out.println(args[0] + "호는 " + catholic[0][1]);
        }
    }
}
