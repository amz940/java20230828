package ch18IO.book.sec04.exam1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class exam1 {
    public static void main(String[] args) {
        // 문자 기반 출력 스트림 생성
        try (Writer writer = new FileWriter("C:/Temp/test.txt")) {
            // 문자  출력
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);
            // 문자 배열 출력
            char[] arr = {'C','D','E'};
            writer.write(arr);
            // 문자열 출력
            writer.write("FGH");
            // 버퍼를 비우고 출력 속도 증가
            writer.flush();
            // 스트림 닫기
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
