package ch11exception.lecture;

public class C23custom {
    // 원하는 익셉션이 없을때 직접 만들어서 쓸 수 있다
    public static void main(String[] args) {
        int money = 300;

        if (money < 10000) {
            throw new LackOfMoneyException();
        }
    }
}
// 돈이 부족해서 출금이 안될때
// uncheck : RuntimeException , check : exception
class LackOfMoneyException extends RuntimeException{
    // extends로 런타임이나 익셉션 상속 받으면 된다
    public LackOfMoneyException(){
        // 기본 생성자
    }
    public LackOfMoneyException(String message){
        super(message); // 조상인 Runtime을 초기화 시켜준다
    }

}
