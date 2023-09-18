package ch18IO.lecture;

import java.io.File;

public class C30directory {
    public static void main(String[] args) {
        // 없는 폴더 만들기
        String path = "C:/Temp/test";
        File file = new File(path);

        System.out.println("file.isDirectory() = " + file.isDirectory());
        if ( !file.exists()){
            file.mkdir(); // 폴더 (디렉토리) 만들기
        }
    }
}
