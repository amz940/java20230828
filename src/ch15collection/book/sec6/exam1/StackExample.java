package ch15collection.book.sec6.exam1;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(9));
        coinBox.push(new Coin(7));
        coinBox.push(new Coin(4));
        coinBox.push(new Coin(2));

        System.out.println("coinBox.size() = " + coinBox.size());

//        while (!coinBox.isEmpty()){   // coinBox가 비어있지 않다면
//            Coin coin = coinBox.pop();
//            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
//        }

        for(int i = 0; i < coinBox.size(); ){   // pop을 쓸려면 for문 돌릴땐 i++를 빼야 한다
            Coin coin = coinBox.pop();          // pop은 실행할수록 size를 하나씩 빼버리고 i는 계속 늘어나기 때문
            System.out.println(coin.getValue());
        }

    }
}
