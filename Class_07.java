import java.util.Random;
import java.util.Arrays;

public class Class_07 {
    // 임의의 정수 배열의 2배의 값들로 된 새로운 배열을 출력
    public static void main(String[] args) {
        Random rand = new Random();
        int[] int_list = new int[10];

        for(int i = 0; i < int_list.length; i++) {
            int_list[i] = rand.nextInt(10);
        }

        System.out.println(Arrays.toString(int_list));

        int[] copy_list = new int[int_list.length];
        copy_list = int_list; // 얕은 복사

        System.out.println(Arrays.toString(copy_list));

        copy_list = new int[int_list.length];
        for(int i = 0; i < copy_list.length; i++) {
            copy_list[i] = int_list[i] * 2;
        }

        System.out.println(Arrays.toString(copy_list));

        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = doubleArray(arr2);
        System.out.println(Arrays.toString(arr3));
    }

    // 2배하는 작업을 함수로 처리
    public static int[] doubleArray(int[] data) {
        int[] copy_data = new int[data.length];
        for(int i = 0; i < copy_data.length; i++) {
            copy_data[i] = data[i] * 2;
        }
        return copy_data;
    }
}
