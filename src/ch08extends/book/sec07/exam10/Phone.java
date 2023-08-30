package ch08extends.book.sec07.exam10;

public abstract class Phone {
    //인스턴스 필드 선언
    String owner;
    //생성자 선언
    Phone(String owner){
        this.owner = owner;
    }
    // 메소드 선언
    void turnOn(){
        System.out.println("폰 전원을 킵니다");
    }
    void turnOff(){
        System.out.println("폰 전원을 끕니다");
    }
}

class SmartPhone extends Phone{
    SmartPhone(String owner){
        super(owner);

    }

    void internetSearch(){
        System.out.println("인터넷검색을 합니다");
    }
}