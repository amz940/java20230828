package ch08interface.book.sec11.exam1;

public interface Tire {
    void roll();
}

class KumhoTire implements  Tire{
    public void roll(){
        System.out.println("금호 타이어가 굴러갑니다");
    }
}

class HankookTire implements  Tire{
    public void roll(){
        System.out.println("한국 타이어가 굴러갑니다");
    }
}

class Car{
    Tire tire1 = new HankookTire();
    Tire tire2 = new KumhoTire();

    void run(){
        tire1.roll();
        tire2.roll();
    }
}