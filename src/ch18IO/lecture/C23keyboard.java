package ch18IO.lecture;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C23keyboard {
    public static void main(String[] args) {
        try{

            InputStream keyboard = System.in;   // 키보드로 쓰고
            InputStreamReader isr = new InputStreamReader(keyboard); // 쓴걸 읽고
            BufferedReader br = new BufferedReader(isr); // 읽은걸 빠르게 처리

            //한줄로 처리 하면
//        BufferedReader br1  = new BufferedReader(new InputStreamReader(System.in));
            try(br; isr){

                String line = br.readLine();
                System.out.println("line = " + line);

                String line2 = br.readLine();
                System.out.println("line2 = " + line2);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
