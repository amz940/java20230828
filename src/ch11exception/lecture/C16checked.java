package ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C16checked {
    public static void main(String[] args) throws FileNotFoundException  {
        System.out.println("작동1");
        try {
            var input = new FileInputStream("file");
            // checked exception은
            // 예외처리코드( try-catch) 꼭 작성
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            // throw로 던지면 코드가 종료되서 밑에 코드들이 작동하지 않는다
            e.printStackTrace();
        }
        System.out.println("작동2");

    }
}
