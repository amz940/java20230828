package ch19networkIO.lecture;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static ch18IO.lecture.C18filter.getOutputStream;

public class C09client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("172.30.1.81",7000);

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            Scanner scanner = new Scanner(System.in);

            try(socket; os; osw; bw; scanner;) {
                while (true){
                    System.out.print("입력");
                    String chat = scanner.nextLine();
                    bw.write(chat);
                    bw.newLine();
                    bw.flush();

                    if ( chat.equals("bye")){
                        break;
                    }
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

    }
}
