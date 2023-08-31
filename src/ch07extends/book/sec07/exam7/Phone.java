package ch07extends.book.sec07.exam7;

public class Phone {
    //필드 선언
    String model;
    String color;

    Phone(){
        System.out.println("생성자 실행");
    }
}

class SmartPhone extends Phone{
    SmartPhone(String model, String color){
        super();
        this.model = model;
        this.color = color;
        System.out.println();
    }

}
