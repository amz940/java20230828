package ch18IO.exam.no10;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        String srcPath = "";
        String desPath = "";

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("원본 파일 경로 :");
            srcPath = scan.nextLine();

            System.out.print("복사 파일 경로 :");
            desPath = scan.nextLine();

            File srcFile = new File(srcPath);
            if (srcFile.exists()) {
                File desFile = new File(desPath);
                File desFileDir = desFile.getParentFile();

                if ( !desFileDir.exists()){
                    desFileDir.mkdirs();
                }
                // 복사하는 일
                InputStream is = new FileInputStream(srcPath); // 원본
                OutputStream os = new FileOutputStream(desPath); // 복사

                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try (bos; bis; is; os;) {
                    byte[] read = new byte[1024];
                    int len = 0;

                    while ((len = is.read()) != -1) {
                        os.write(read, 0 , len);
                    }

                    System.out.println("복사가 성공되었습니다");
                }
            } else {
                System.out.println("원본파일이 존재하지 않습니다");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
