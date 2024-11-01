package Class_15;

import java.util.Arrays;

public class arrayUtil {
    static void print(int[] x){
        System.out.println("{");
        for(int a: x) {
            System.out.println(a+", ");
        }
        System.out.println("}");
    }
    static void print(double[] y){
        System.out.println("{");
        for(double b: y) {
            System.out.println(b+", ");
        }
        System.out.println("}");
    }
}
