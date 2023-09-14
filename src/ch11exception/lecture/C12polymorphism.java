package ch11exception.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        // 상위 타입의 exception을 작성할 땐
        // 항상 순서에 유의 하면서 작성해라
        try{
            // ClassCastException
            // NullPointerException
            // ArithmeticException
        } catch (RuntimeException e){
            // ArithmeticException
            // NullPointerException
        } /*catch (ClassCastException e){
            // 이미 앞에서 exception을 해결해 버려서 해결할 코드가 없다
        }*/
    }
}
