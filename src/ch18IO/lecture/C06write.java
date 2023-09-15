package ch18IO.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C06write {
    public static void main(String[] args) {
        String path = "C:/Temp/out3.txt";

        try (OutputStream os = new FileOutputStream(path)) {

            byte[] b = {65, 66, 67, 68, 69}; // 아스키 코드

            os.write(b);
            os.write(b, 0, 3); // 0번 인덱스부터 3개까지만 출력
            os.write(b, 2, 2); // 2번 인덱스부터 2개까지만 출력

            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
