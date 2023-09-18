package ch14thread.book.sec5.exam2;

public class JoinExample {
    public static void main(String[] args) {
        Sumthread sumthread = new Sumthread();
;
        sumthread.start();
        try {
            sumthread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("1~100까지의 합 : " + sumthread.getSum());
    }
}
