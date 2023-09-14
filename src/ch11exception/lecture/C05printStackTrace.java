package ch11exception.lecture;

public class C05printStackTrace {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code2");
        } catch (Exception e) {
            // printStackTrace
            // exception이 뜬 코드를 출력해준다, 흔적을 남겨줘야 수정이 쉽다
            // 초보자일 경우 무조건 써주자
            e.printStackTrace();

        }

        System.out.println("code3");
            // 콘솔창과 에러창은 똑같은 공간을 쓰기 때문에 순서가 바뀐 경우도 있다
            // 똑같은 공간을 같은 시간에 처리하기 때문, 오류가 아니다
    }
}
