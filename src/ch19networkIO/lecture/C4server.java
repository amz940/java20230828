package ch19networkIO.lecture;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C4server {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            try(serverSocket; socket; os; osw; bw;){
                bw.write("안녕하세요 클라이어트12345 😊");
            }
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
