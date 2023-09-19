package ch14thread.lecture;

public class C14synchronized {
    public static void main(String[] args) throws InterruptedException {
        MyBox14 box = new MyBox14(0);

        Thread t1 = new Thread(new Task14(box));
        Thread t2 = new Thread(new Task14(box));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("box.getValue() = " + box.getValue());
    }
}

class Task14 implements Runnable{
    private  MyBox14 box;

    public Task14(MyBox14 box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            box.increment();
        }
    }
}
class MyBox14{
    private int value;

    public MyBox14(int value) {
        this.value = value;
    }


    public synchronized void increment(){
        // 싱크로라이즈 메소드
        // 메소드 전체가 싱크로가 되어야 한다면
        // 메소드 앞에 싱크로를 붙이는걸로 해결
        // monitor lock은 this
        // 사용시 또 다른 익셉션이 발생할 확률이 크다
//        System.out.println("code1");
        value++;
//        System.out.println("code2");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}