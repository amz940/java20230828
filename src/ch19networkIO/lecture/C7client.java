package ch19networkIO.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class C7client {
    public static void main(String[] args) {
        // server가 client에게 파일 보내기
        try {
            Socket socket = new Socket("172.30.1.92", 5000);

            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);

            String path ="C:/Temp/test-server1.png";
            FileOutputStream fos = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try (is; socket; bis; fos; bos;) {
                byte[] bytes = new byte[1024];
                int len = 0;

                while ((len = bis.read(bytes)) != -1) { // 핵심 코드
                    bos.write(bytes, 0, len);
                }

                bos.flush();
                System.out.println("전송 완료");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
