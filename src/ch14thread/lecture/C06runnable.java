package ch14thread.lecture;

import java.awt.*;

public class C06runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<3; i++){
                    System.out.println("띵");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread1.start();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                toolkit.beep();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread2.start();
    }
}
