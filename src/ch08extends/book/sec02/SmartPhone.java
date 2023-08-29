package ch08extends.book.sec02;

public class SmartPhone extends Phone {
     boolean wifi;

    SmartPhone(String model, String color){
        //phone 필드에 private를 걸면 this.name에 오류
        //여기서 this는 상속해준 Phone의 field 다
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경합니다");
    }
    public void internet(){
        System.out.println("인터넷에 연결합니다");
    }
}
