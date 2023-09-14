package ch11exception.lecture;

public class C10catch {
    public static void main(String[] args) {
        try{
            // exception 발생 코드
        } catch (ArrayIndexOutOfBoundsException e){
            // exception 처리 코드
        } catch ( NumberFormatException e ) {
            // exception 처리 코드
        }

        try {

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            // exception 처리 코드가 여러개 라면 | 을 이용해서 한줄로 작성 가능
            // 변수 명은 맨 끝에만 붙이면 된다
        }
    }
}
