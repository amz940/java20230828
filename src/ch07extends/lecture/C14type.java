package ch07extends.lecture;

import ch07extends.book.sec07.exam03.Parent;

public class C14type {
    public static void main(String[] args) {
        //기본타입
        int a = 3;  // a 의 타입은 int
        double abc = 3.14;


        //참조타입
        String b = "type";  // b의 타입은 string
        Object c = "java";  // c의 타입은 object
        Child d = new Child();   // c의 타입은 child
        Parent e = new Parent();    // d의 타입은 parent
    }
}
class Child{

}