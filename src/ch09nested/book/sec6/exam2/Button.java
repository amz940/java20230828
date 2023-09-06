package ch09nested.book.sec6.exam2;

public class Button {
    //정적 멤버 인터페이스
    public static interface ClickLister{
        // 추상 메소드
        void onClick();
    }
    // 필드
    private ClickLister clickLister;
    // 메소드
    public void setClickLister(ClickLister clickLister){    //setClickLister 가 아니라 abc여도 결과 도출엔 에러가 없다 왜지?
        this.clickLister = clickLister;
    }
}
