package ch98internetExample;

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank(), new Dropship()};
//        Unit[] group = new Unit[3];   이 문장을 줄이면 윗 문장이다
//        group[0] = new Marine();
//        group[1] = new Tank();
//        group[2] = new Dropship();

        for ( int i = 0; i < group.length; i++){
            group[i].move(100, 200);
        }
    }
}

abstract class Unit{
    int x , y;
    abstract void move(int x , int y);
    void stop(){
        System.out.println("정지");
    }
}

class Marine extends Unit{
    void move(int x, int y){
        System.out.println("이동");
    }
    void stimPack(){
        System.out.println("사용");
    }
}

class Tank extends Unit{
    void move(int x , int y){
        System.out.println("이동");
    }
    void change(){
        System.out.println("변신");
    }
}

class Dropship extends Unit{
    @Override
    void move(int x, int y) {
        System.out.println("이동");
    }
    void load(){
        System.out.println("타다");
    }
    void unLoad(){
        System.out.println("내리다");
    }
}