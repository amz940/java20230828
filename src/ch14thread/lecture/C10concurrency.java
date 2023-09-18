package ch14thread.lecture;

public class C10concurrency {
    private static int value = 0;

    public static void main(String[] args) {
        // 동시에 일어나서 생기는 문제
        // 컴터 성능에 따라 연산 실행 회수가 많아질수록 결과값이 다르게 나온다.
        Thread t1 = new Thread(()->{
            for (int i = 0; i <50000; i++){
                value++;
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
           for (int i=0; i <50000; i++){
               value++;
           }
        });
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("value = " + value);
    }
}
