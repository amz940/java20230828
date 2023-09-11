package ch98internetExample.toString;

import java.util.Objects;

public class toString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));
        // equals 값이 true면 hashCode 값도 같아야 한다
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
class Card{
    String kind;
    int number;

    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
    // 매개변수가 있는 생성자라 원래는 객체 생성할 때 값을 지정해줘야 하지만
    // 이렇게 따로 지정해 놓아도 불러 오는덴 문제없다
    Card(){
        this("Spade", 1);
    }
    // Object 클래스의 toString( ) 을 오버라이딩
    @Override
    public String toString() {
        return "Card{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Card card = (Card) object;
        return number == card.number && Objects.equals(kind, card.kind);
    }
    // equals()를 오버라이딩 하면 hashCode()도 오버라이딩 해야한다.
    // Objects클래스는 객체와 관련된 유용한 메소드를 제공하는 유틸 클래스다
    @Override
    public int hashCode() {
        return Objects.hash(kind, number);
    }
}