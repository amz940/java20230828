package ch18IO.lecture;

import java.io.File;

public class C29file {
    public static void main(String[] args) {
        // 파일 정보 얻기
        String path = "C:/Temp";
        File file = new File(path);
        
        // 디렉토리인지?
        System.out.println("file.isDirectory() = " + file.isDirectory()); // true
        // 파일 목록 얻기
        File[] files = file.listFiles();
        // 파일정보 출력
        for ( File f : files){
            System.out.println("f.getName() = " + f.getName());
        }

    }
}
