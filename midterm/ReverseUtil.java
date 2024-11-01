package midterm;

import java.util.Arrays;

public class ReverseUtil {

    static int[] reverse(int[] target) {
        int[] x = new int[target.length];
        for (int i = target.length-1; i >= 0; i--) {
            x[target.length-1 - i] = target[i];
        }
        return x;
    }

    static String reverse(String s) {
        String x = "";
        for (int i = s.length() -1; i >= 0; i--) {
            x += s.charAt(i);
        }
        return x;
    }
    public static void main(String[] args) {

        String s1 = "refer";
        if (s1.equals(reverse(s1))) {
            System.out.println("회문");
        } else {
            System.out.println("sh");
        }
    }
}
