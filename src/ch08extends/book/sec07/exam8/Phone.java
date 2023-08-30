package ch08extends.book.sec07.exam8;

public class Phone {
    String model;
    String color;

    Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color)생성자 실행");
    }
}

    class SmartPhone extends Phone{
        SmartPhone(String model, String color){
            super("갤럭시", "은색");
            System.out.println("SmartPhone 생성자 실행");
    }

}

