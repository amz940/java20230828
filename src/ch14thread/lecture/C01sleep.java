package ch14thread.lecture;

public class C01sleep {
    public static void main(String[] args) throws InterruptedException {
        // thread : 하나의 업무 흐름 이라고 생각하면된다
        // sleep : n millis(1/1000s)만큼 멈추고 다시 실행한다
        System.out.println("code1");
        Thread.sleep(1000);
        System.out.println("code2");
        Thread.sleep(1000);
        System.out.println("code3");


    }
}
