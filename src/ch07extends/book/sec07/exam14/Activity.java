package ch07extends.book.sec07.exam14;

public class Activity {
    public static void main(String[] args) {
        MainActivity main = new MainActivity();
        main.onCreate();

    }
    void onCreate(){
        System.out.println("기본적인 실행 내용");
    }
}

class MainActivity extends Activity{
    void onCreate(){
        super.onCreate();
        System.out.println("추가적인 실행 내용");
    }
}