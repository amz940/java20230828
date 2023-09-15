package ch18IO.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02outputStream {
    public static void main(String[] args) {
        // OutputStream : 바이트단위 출력 스트림
        try {
            OutputStream os = new FileOutputStream("out.txt");
            os.write(120);
            os.write(4);
            os.write(76);

            os.close(); // stream을 쓰면 꼭!! close()를 써서 닫아줘야 한다.
                        // 안 닫아주면 오류가 발생할 수 있다.

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
