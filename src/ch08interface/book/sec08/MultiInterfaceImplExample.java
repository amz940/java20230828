package ch08interface.book.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        //RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
        RemoteControl rc = new SmartTelevision();
        //RemotControl 인터페이스에 선언된 추상 메소드만 호출 가능
        rc.turnOn();
        rc.turnOff();
        //Searchable 인터페이스 변수 선언 및 구현 객체 대입
        Searchable search = new SmartTelevision();
        //Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
        search.search("https://github.com/sebaek");

    }
}
