package ch18IO.lecture;

import java.io.*;

public class C11copy {
    public static void main(String[] args) {
        String src = "C/Temp/test.png";
        String des = "C/temp/test3.png";

        try {
            InputStream is = new FileInputStream(src);
            OutputStream os = new FileOutputStream(des);

            try (is; os) {
                byte[] data = new byte[1024];

                int len = 0;
                while ((len = is.read(data)) != -1) {
                    os.write(data, 0, len);
                }
                os.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
