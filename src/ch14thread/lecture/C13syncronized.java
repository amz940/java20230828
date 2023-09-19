package ch14thread.lecture;

public class C13syncronized {
    public static void main(String[] args) throws InterruptedException {
        // syncronized
        // 여러개의 쓰레드가 들어올때
        // 맨 처음 들어온 쓰레드만 실행하게 해준다
        // 단 다 실행하면 lock을 걸린 메소드를 반환해줘서 따른 쓰레드도 실행할수 있다.
        MyBox box = new MyBox(0);
        Thread t1 = new Thread(new Task(box));
        t1.start();
        

        Thread t2 = new Thread(new Task(box));
        t2.start();

        t1.join();
        t2.join();

        System.out.println("box.getValue() = " + box.getValue());
    }
}
class Task implements Runnable{
    private MyBox box;

    public Task(MyBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            box.increment();
        }
    }
}

class MyBox {
    private int value;

    // monitor lock
    private Object lock = new Object();

    public MyBox(int value) {
        this.value = value;
    }


    public void increment(){
        // 싱코르라이즈 블럭
        synchronized (lock){
            value++;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}
