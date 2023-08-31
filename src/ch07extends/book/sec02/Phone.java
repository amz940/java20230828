package ch07extends.book.sec02;

public class Phone {
    String model;
    String color;

    public void bell(){
        System.out.println("벨이 울립니다");
    }
    public  void sendVoice(String messege) {
        System.out.println("자기 : "+ messege);
    }

    public void receiveVoice(String messege) {
        System.out.println("상대방 : "+ messege);
    }
    void hangup(){
        System.out.println("전화를 끊는다");
    }
}


