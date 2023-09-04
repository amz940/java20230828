package ch16lambda.book.sec3;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1( (String name, String job) -> {
            System.out.println(name + "이");
            System.out.println(job + "을 합니다");
        });
        //위 코드를 한 줄로 줄인다
        person.action1((name, job) -> {
            System.out.println(name + "이" + job + "을 하지 않습니다");
        });

        person.action2( (String word) -> {
            System.out.print("\"" + word + "\"");
            System.out.println("라고 말합니다");

        });
        person.action2(word -> System.out.println("\"" + word + "\"라고 말합니다."));
    }
}

class MySpeakable implements Speakable{

    @Override
    // 객체 이름은 바껴도 상관없다
    public void speak(String content) {
        System.out.println(content + "라고 외칩니다");
    }
}
