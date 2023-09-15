package ch18IO.lecture;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class C20bufferd {
    public static void main(String[] args) {
        // 실행속도를 빠르게 해주는 코드들
        String path = "C:/Temp/out9.txt";

        try{
            Writer writer = new FileWriter(path);
            try (writer) {
                long start = System.currentTimeMillis();
                for ( int i = 0 ; i < 10000; i++){
                    writer.write('가');
                }
                writer.flush();
                long end = System.currentTimeMillis();
                System.out.println("그냥 :" + ( end- start) + "ms");
            }
            String path2 = "C:/Temp/out10.txt";
            Writer writer2 = new FileWriter(path2);
            Writer writer3 = new BufferedWriter(writer2);

            try ( writer2; writer3){
                long start2 = System.currentTimeMillis();
                for ( int i = 0; i < 10000; i++){
                    writer3.write('나');
                }
                writer3.flush();
                long end2 = System.currentTimeMillis();

                System.out.println("버퍼 : " + (end2 - start2) + "ms");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
