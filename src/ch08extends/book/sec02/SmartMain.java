package ch08extends.book.sec02;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone myphone = new SmartPhone("갤럭시","은색");

        System.out.println("모델 = " + myphone.model);
        System.out.println("색상 = " + myphone.color);

        System.out.println("와이파이의 상태 : "+myphone.wifi);

        myphone.bell();
        myphone.sendVoice("여보세요");
        myphone.receiveVoice("전화받았습니다");
        myphone.hangup();

        myphone.setWifi(true);
        myphone.internet();

    }
}
