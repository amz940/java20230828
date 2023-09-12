package ch15collection.lecture;

import java.util.Stack;

public class C14stack {
    public static void main(String[] args) {
        // stack ( LIFO : Last In First Out )
        // 주요 메소드
        // push : 마지막에 아이템 추가
        // pop : 마지막 아이템 꺼내기(삭제)
        // peek : 마지막 아이템 삭제는 하지 않고 확인만 하기

        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(8);
        stack.push(3);

        System.out.println("stack.size() = " + stack.size());
        
        stack.pop();
        System.out.println("stack.size() = " + stack.size());
        Integer popped = stack.pop();   // 어떤걸 꺼냇는지 확인
        System.out.println("popped = " + popped);

        System.out.println("stack.peek() = " + stack.peek());
    }
}
