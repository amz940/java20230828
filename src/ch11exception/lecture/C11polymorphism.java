package ch11exception.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        // 다형성
        try{

        } catch (NullPointerException e){
            // 동일한 예외처리코드
        } catch ( ArrayIndexOutOfBoundsException e){
            // 동일한 예외처리코드
        }

        try{
            // NullPointerException
            // ArithmeticException이 발생하든 exception에 속해있기 때문에 상관없다
        } catch ( Exception e){
            // 여러 exception의 상위 타입으로 한번에 잡을 수 있다
            // 단 Throwable 타입 까지만 가능 , object는 안됨
            // 동일한 예외처리 코드
        }
    }
}
