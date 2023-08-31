package ch07extends.book.sec07.exam12;

public abstract class Machine {
    void powerOn(){}
    void powerOff(){}
    abstract void work();
}
class Computer extends Machine{
    void work(){
        System.out.println("작업을 시작하다");
    }
}