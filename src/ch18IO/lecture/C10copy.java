package ch18IO.lecture;

import java.io.*;

public class C10copy {
    public static void main(String[] args) {
        String src = "C:/Temp/out3.txt";
        String des = "C:/Temp/out3_copy.txt";

        try ( InputStream is = new FileInputStream(src);
                OutputStream os = new FileOutputStream(des)
              ) {

            byte[] b = new byte[3];

//            int len1 = is.read(b);
//            os.write(b, 0, len1);
//
//            int len2 = is.read(b);
//            os.write(b, 0, len2);
//
//            int len3 = is.read(b);
//            os.write(b,0, len3);
//
//            int len4 = is.read(b);
//            os.write(b,0, len4);
//
//            int len5 = is.read(b); // -1

            int len = 0;

            while (( len = is.read(b)) != -1) { // 해당 코드를 쓰는 이유는 해당 파일에 있는 바이트 배열을 새로운 바이트 배열객체를 만들어서
                os.write(b, 0, len);        // 들고오는데 딱 맞아 떨이면 상관이 없으나 맨 마지막에 가져오는 배열은 차이가 생길 수 밖에 없다
            }                             // 그 차이 나는 공간을 컴터가 알아서 채워 넣어버리기 때문에 원하는 결과값이 안나와서
                                          // 원하는 결과값이 나오게 끔 설정 하는것
            // [ 1, 2, 3, 4, 5, 6, 7, 8 ] 배열을 byte[3]으로 가져온다고 했을때
            // [1,2,3]
            // [4,5,6]
            // [7,8,6] 이라는 결과 값을 뽑아버린다  --> [7,8 ]로 바꾸는것
            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
