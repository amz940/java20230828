package ch18IO.book.sec2.exam2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("C:/Temp/test2.db")) {

            byte[] array = {65, 20, 30};

            os.write(array);

            os.flush(); //
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
