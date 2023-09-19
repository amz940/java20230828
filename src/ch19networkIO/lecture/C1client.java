package ch19networkIO.lecture;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class C1client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.30.1.92", 3000); // 주소번호, 포트번호
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(writer);

            try(socket; writer; bw){
                bw.write("안녕하세여!!");
            }
        }   catch (Exception e){
            e.printStackTrace();
        }



    }
}
