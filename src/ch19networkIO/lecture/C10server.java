package ch19networkIO.lecture;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class C10server {
    public static void main(String[] args) {

        System.out.println("채팅 프로그램 시작");
        try{
            ServerSocket serverSocket = new ServerSocket(7000);
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();

            Reader reader = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(reader);

            try(serverSocket;socket;reader;br;){
                String line = "";
                SocketAddress address = socket.getRemoteSocketAddress();

                System.out.println( address + "님이 참여합니다");

                while (( line = br.readLine()) != null){
                    System.out.println( address + ":" + line);

                    if (line.equals("bye")){
                        System.out.println(address + "님이 나가셨습니다");
                        break;
                    }
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }
    }
}
