package ch19networkIO.lecture;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C2server {
    public static void main(String[] args) {
        // 서버생성 메소드
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();// 연결되길 기달리는 메소드

            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            try (serverSocket; socket; is; isr; br){ // 읽고 닫는다. .close()
                String line = br.readLine(); // 한줄씩 읽는다
                System.out.println("line = " + line);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
