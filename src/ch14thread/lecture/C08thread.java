package ch14thread.lecture;

public class C08thread {
    public static void main(String[] args) {
        // 총 3개의 쓰레드가 실행된다 , 2개가 아니다
        // 메인 메소드도 하나의 쓰레드로 들어간다.
        // 쓰레드와 스트림의 차이?
        // 둘다 하나의 물결처럼 실행

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<5; i++){
                    System.out.println("t1 thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for(int i =0; i<5; i++){
                System.out.println("t2 thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t2.start();

        for (int i = 0; i<5; i++){
            System.out.println("main thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
