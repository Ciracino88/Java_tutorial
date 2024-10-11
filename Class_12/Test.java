package Class_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Test {
    int x;
    static int y = 1;

    Test(int a) {
        this.x = a;
    }

    static void show() {
        System.out.println("test");
    }

    static void file_read() {
        String fileName = "/workspaces/Java_tutorial/Class_12/사고 싶은거.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // 각 줄을 "_"를 기준으로 분리하여 배열로 저장
                String[] parts = line.split("_");

                // Cloth 객체에 데이터를 부여
                Cloth c = new Cloth();
                // 분리된 내용을 출력 (필요에 따라 처리 가능)
                for (int i = 0; i <= 2; i++) {
                    c.get_data(parts[i], i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
