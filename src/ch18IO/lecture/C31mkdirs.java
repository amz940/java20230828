package ch18IO.lecture;

import java.io.File;

public class C31mkdirs {
    public static void main(String[] args) {
        // mkdirs : 여러 파일 한번에 만들기
        String path = "C:/Temp/test1/test2/test3";
        File file = new File(path);
        System.out.println("file.exists() = " + file.exists()); // false

        if(!file.exists()){
            file.mkdirs(); // 여러개의 폴더 만들기
        }
    }
}
