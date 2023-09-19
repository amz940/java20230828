package ch14thread.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class C12atomic {
    private static AtomicInteger value = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        // 높은 수를 멀티쓰레드로 계산할때 오차 발생 줄이는법
        // atomic을 사용하여 오차를 줄인다
        // lang 패키지에 있는 메소드랑 연동을 안해서 많이 불편하다
        // 제일 좋은건 그렇게 실행을 안하는게 제일 좋다

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 100000; i++) {
                value.getAndIncrement();
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 100000; i++) {
                value.getAndIncrement();
            }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.println(value);
    }
}
