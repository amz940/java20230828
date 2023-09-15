package ch18IO.book.sec3;

import java.io.*;

public class exam3 {
    public static void main(String[] args)  {
        String originalFileName = "C:/Temp/test.png"; // 이파일을 복사해서
        String targetFileName = "C:/Temp/test2.png"; // 이렇게 만들겠다

        try (InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName)
        ) {
            byte[] data = new byte[1024];
            while (true) {
                int num = is.read(data);
                if (num == -1) {
                    break;
                }
                os.write(data, 0, num);
            }

            os.flush();
            os.close();
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("복사가 잘 됬습니다");
    }
}
