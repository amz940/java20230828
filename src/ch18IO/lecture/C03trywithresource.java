package ch18IO.lecture;

import java.io.*;
import java.util.Scanner;

public class C03trywithresource {
    public void method1() {
        OutputStream os = null;
        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally { // 꼭 실행되어야 하는 코드들은 finally에 넣어주는게 바람직하다
            try {
                os.close(); // io stream 사용시 꼭 닫아줘야함
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void method2(){

        // try-with-resources 문법
        // close를 안써도 자동으로 적용된다
        // 변수의 타입은 AutoCloseable이어야 한다!
        try (OutputStream os = new FileOutputStream("")){

            os.write(33);
            os.write(67);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  void method3(){
        try (
                FileOutputStream fos = new FileOutputStream("");
                FileInputStream fis = new FileInputStream("");
        ) {
            fos.write(234);
            fis.read();
//            fos.close(); // autocloseable이라 자동 적용
//            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void method4(){
        Scanner scanner = new Scanner("");
        try (scanner) { // 값을 한번만 줄 때는 객체이름만 적어주면 된다
            scanner.hasNext();
            scanner.next();
        }
    }

    public  void method5(){
        try {
            FileOutputStream fos = new FileOutputStream("");
            FileInputStream fis = new FileInputStream("");

            try (fis;fos){
                fos.write(33);
                fis.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void method6() throws IOException {
        // 안좋은 코드다
        // exception을 발생시킬 여지가 있는 코드여서 안좋은 코드다
        // stream을 사용했으면 꼭 close로 닫아줘야 하는데
        // 만약 위쪽에서 exception이 발생하면 close가 실행되지 못하기 때문에 위험!!

        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        fos.write(33);
        fis.read();

        fos.close();
        fis.close();


    }
}
