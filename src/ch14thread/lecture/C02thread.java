package ch14thread.lecture;

import java.awt.*;

public class C02thread {
    public static void main(String[] args) {
        // 특정 효과음을 내게 하는 것
        Toolkit toolkit = Toolkit.getDefaultToolkit();


        // 같이 실행하는거 처럼 보여도 실제론 차이가 있다
        // 다만 실행속도가 너무 빨라서 같이 하는거처럼 보일뿐
        // 코드가 기이이일게 늘어질수록 차이가 느껴진다
        for ( int i = 0 ; i < 5; i++){
            toolkit.beep();
            System.out.println("윙?");
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
