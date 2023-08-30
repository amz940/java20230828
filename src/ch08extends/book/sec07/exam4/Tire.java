package ch08extends.book.sec07.exam4;

public class Tire {

    void roll(){
        System.out.println("회전합니다");
    }
}

class HanKookTire extends Tire{
    void roll(){
        System.out.println("한국 타이어가 회전합니다");
    }
}

class KumHoTire extends Tire{
    void roll(){
        System.out.println("금호 타이어가 회전합니다");
    }
}
