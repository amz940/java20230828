package ch19networkIO.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C8server {
    public static void main(String[] args) {
        // server가 client에게 파일 보내기
        // accept를 for문 돌려서 일정 수만큼 반복해서 받기

        // 여러명이 접속해서 ( 멀티 쓰레드 ) 같은 파일을 다운 받는 코드
        ServerSocket serverSocket = null;

        try{
            serverSocket = new ServerSocket(5000);

            for (int i = 0; i < 30; i++) {
                Socket socket = serverSocket.accept(); // 접속에 성공하면 socket이 하나씩 만들어진다

                Thread t = new Thread(()->{
                    try {
                        String path ="C:/Temp/test.png";

                        InputStream is = new FileInputStream(path);
                        BufferedInputStream bis = new BufferedInputStream(is);

                        OutputStream os = socket.getOutputStream();
                        BufferedOutputStream bos = new BufferedOutputStream(os);

                        try(is;bis;os;bos;){
                            byte[] bytes = new byte[1024];
                            int len = 0;

                            while (( len = bis.read(bytes)) != -1) {
                                bos.write(bytes,0,len);
                            }

                            bos.flush();

                            System.out.println("클라이언트가 파일을 보냈스비나다");
                        }
                    } catch ( Exception e){
                        e.printStackTrace();
                    } finally {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
                t.start(); // 시작을 안하면 데이터가 전송이 안된다
            }
        } catch ( Exception e){
            e.printStackTrace();
        } finally{ // serverSocket은 반드시 닫혀야 한다.
            try {
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
