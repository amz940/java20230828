package ch18IO.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C05write {
    public static void main(String[] args) {
        String path = "C:/Temp/out2.txt";

        try (OutputStream os = new FileOutputStream(path)) {
            byte[] b = new byte[100];
            os.write(b);
            os.write(b);

            os.flush(); // 출력 성능 향상을 위해 쓰인다
                        // 바로바로 출력해서 지연되지 않게 할려고
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
