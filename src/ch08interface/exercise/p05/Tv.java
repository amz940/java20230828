package ch08interface.exercise.p05;

public class Tv implements Remocon{
    public void powerOn() {
        System.out.println("Tv를 켰습니다");
    }

    public static void main(String[] args) {
        Remocon r = new Tv();
        r.powerOn();
    }
}
