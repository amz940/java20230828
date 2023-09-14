package ch11exception.exam.no7;

public class LoginExample {
    public static void main(String[] args) {
        try{
            login("white","12345");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("로그인 되었습니다");

        System.out.println("2번째 시도");
        try {
            login("blue","54321");
        } catch ( Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void login(String id, String password) throws Exception {
        // id가 blue가 아니면 NotEx 발생
        if(!id.equals("white")){
            throw new NotExistIDException("아이디가 틀립니다");
        }
        if (!password.equals("12345")) {
            throw new WrongPasswordException("비밀번호가 틀립니다");
        }
    }
}
