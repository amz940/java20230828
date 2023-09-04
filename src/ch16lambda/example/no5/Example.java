package ch16lambda.example.no5;

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        // 람다식
        btnOk.setClickListener( () -> System.out.println("Ok 버튼을 클릭했습니다."));
        // 익명 클래스
        btnOk.setClickListener( () -> {
            System.out.println("Ok 버튼을 클릭했습니다.");
        });
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener( () -> System.out.println("Cancle 버튼을 클릭했습니다"));
        btnCancel.click();
    }
}
