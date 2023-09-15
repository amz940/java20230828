package ch18IO.book.sec2.exam3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("C:/Temp/test3.db")) {

            byte[] array = { 10, 20, 30, 40, 50};

            os.write(array, 1, 3); // 1번 인덱스부터 3개까지만 출력

            os.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
