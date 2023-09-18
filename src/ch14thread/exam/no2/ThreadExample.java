package ch14thread.exam.no2;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread(); // 클래스를 상속 받아서 바로 생성
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable()); // 파라미터를 받아서 새로운 객체 만들고 생성
        thread2.start();

        // 영화를 재생합니다
        //음악을 재생합니다
        //음악을 재생합니다
        //영화를 재생합니다
        //영화를 재생합니다
        //음악을 재생합니다
        // 콘솔창에 순서가 뒤바껴서 나올수도 있는데 이는 2개의 쓰레드를 하나의 콘솔창에 출력
        // 해서 그런거다
    }
}
