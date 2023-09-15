package ch18IO.book.sec3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class exam2 {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/test2.db")) {
            byte[] data = new byte[100]; // 100 바이트를 가진 data배열 생성

            while(true) {
                int num = is.read(data); //
                if( num == -1 ) {
                    break; // 파일 끝에 도달하면 종료
                }

                for(int i = 0 ; i < num; i++) { // 읽은 바이트 출력
                    System.out.println(data[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
