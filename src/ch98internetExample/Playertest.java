package ch98internetExample;

abstract class Player{ // 추상 클래스
    abstract void play (int pos); // 추상 메소드
//    void stop( ){}; // 이렇게 작성 해도 되지만 타인이 볼때 문제의 여지가 생긴다
    abstract  void stop ();
}
class AudioPlayer extends Player{ // 만약 2개의 메소드 중 하나라도 오버라이드 안 했으면
                                  // 앞에 abstract 를 붙여줘야 한다
    @Override
    void play(int pos) {
        System.out.println(pos + "실행한다");
    }

    @Override
    void stop() {
        System.out.println("멈춘다");
    }
}

public class Playertest {
    public static void main(String[] args) {
//        Player p = new Player(); // 상속을 통해 몸통을 완성 해줘야 한다
        AudioPlayer ap = new AudioPlayer();
        Player p = new AudioPlayer();   // 다형성
        p.play(200);
        p.stop();

    }
}
