import java.util.Arrays;

public class Class_08 {
    public static void main(String[] args) {
        int[][] x = new int[5][5];

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++) {
                x[i][j] = i*j;
            }
        }

        System.out.println(Arrays.deepToString(x));

        // 비정방행렬 만들기
        int[][] y = new int[4][];

        for (int i = 0; i < y.length; i++) {
            y[i] = new int[i+1]; // i=0 일때 1개의 공간 생성, 1일때 2개의 공간 생성
            for (int j = 0; j < y[i].length; j++) {
                y[i][j] = j;
            }
            System.out.println(Arrays.toString(y[i]));
        }
    }
}
