package ch09nested.book.sec6.exam3;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener{

            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다");
            }
        }

        btnOk.setClickListener(new OkListener());
        btnOk.click();

        Button btnNo = new Button();
        class CancelListener implements Button.ClickListener{

            @Override
            public void onClick() {
                System.out.println("Cancle 버튼을 클릭했습니다.");
            }
        }

        btnNo.setClickListener(new CancelListener());

        btnNo.click();
    }

}
