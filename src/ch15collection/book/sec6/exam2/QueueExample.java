package ch15collection.book.sec6.exam2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messages = new LinkedList<>();

        messages.offer(new Message("sendMail", "홍길동"));
        messages.offer(new Message("sendSMS","신"));
        messages.offer(new Message("sendKakao","감"));

        while (!messages.isEmpty()){
            Message message = messages.poll();
            switch (message.getCommand()){
                case "sendMail" :
                    System.out.println(message.getTo() + "메일 보냄");
                    break;
                case "sendSMS" :
                    System.out.println(message.getTo() + "SMS를 보냄");
                    break;
                case "sendKakao" :
                    System.out.println(message.getTo() + "카카오를 보냄");
                    break;
            }
        }
    }
}
