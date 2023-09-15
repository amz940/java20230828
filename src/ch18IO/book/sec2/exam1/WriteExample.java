package ch18IO.book.sec2.exam1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
//        OutputStream os = null;
        try( OutputStream os = new FileOutputStream("C:/Temp/test1.db");) {


            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();  // 해당 데이터를 close 하기전에 flush로 다 비어내고 닫으면
                        // 안전하다?
            // 근데 어떻게 컴터가 해당 작업을 끝내지도 않았는데 종료될수가 있는건가?
            // 컴터도 완벽하진 않다?

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
