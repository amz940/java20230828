package ch08extends.book.sec04.exam01;

public class ComputerMain {
    public static void main(String[] args) {
        int r = 10;

        Calculator cal = new Calculator();
        System.out.println("원 면적 : "+cal.areaCircle(r));

        Computer com = new Computer();
        System.out.println("컴터 원 면적 : "+com.areaCircle(r));
    }
}
