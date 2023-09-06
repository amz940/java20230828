package ch09nested.example.no06;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.vehi.run();
        anonymous.method1();
        anonymous.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다");
            }
        });
    }
}
